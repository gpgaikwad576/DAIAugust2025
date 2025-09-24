
from django.shortcuts import render,redirect,get_object_or_404
from django.http import HttpResponse
from django.contrib import messages
from .forms import UserDetailsForm,UserUpdateForm,UserRegisterForm,UserDetectionForm
from django.contrib.auth.forms import UserCreationForm
from newapp.models import  Mcount,Xray,Xray_result,Details
from django.contrib.auth.decorators import login_required
import tensorflow as tf
import h5py
from django.conf import settings
import numpy
from keras.models import load_model
from keras.preprocessing import image
from django.core.files.storage import FileSystemStorage
img_height,img_width=300,300
import os,sys
import numpy as np
import datetime,pdfcrowd
from django.template.loader import get_template
from xhtml2pdf import pisa
from django.conf.urls import url
from django.urls import path
from django.contrib.auth.models import AbstractUser,User
from django.contrib.staticfiles import finders
from fpdf import FPDF

model_graph = tf.compat.v1.Graph()
with model_graph.as_default():
  tf_session = tf.compat.v1.Session()
  with tf_session.as_default():
    model=load_model('newapp/ML2/model6_all.h5')
    

def intro(request):

  print("\n\nget_full_path:"+str(request.get_full_path)+"\n\npath:"+str(request.path)+"\n\nurl:"+"\n\n")
  temp=Mcount.objects.first()
  
  context={
    'check':temp.check,
    'covid':temp.covid,
    'pneum':temp.pneum,
    'normal':temp.normal,
    'other':temp.other
  }
   
  return render(request,'newapp/base.html',context)



   
  

def login(request):
  print("login\n\nget_full_path:"+str(request.get_full_path)+"\n\npath:"+str(request.path)+"\n\nurl:"+"\n\n")
  return render(request,'newapp/mini_login.html')
def logout(request):
  return render(request,'newapp/logout.html')

from django.views.decorators.csrf import csrf_protect


def register(request):
    print("register\n\nget_full_path:"+str(request.get_full_path)+"\n\npath:"+str(request.path)+"\n\nurl:"+"\n\n")
    
    if request.method == 'POST':
        print('Randu') 
        c_form=UserRegisterForm(request.POST)
        if c_form.is_valid():
            print('fundogondo2')
            c_form.save()
            username = c_form.cleaned_data.get('username')
            messages.success(request, f'Account created for {username}.You can now LogIn!')
            return redirect('login')
    else:
        c_form=UserRegisterForm()
    print('gandu')   
    context={
      'c_form':c_form,
      
    }
    return render(request,'newapp/mini_register.html',context)

@login_required
def details(request):
    if request.method == 'POST':
        
        u_form=UserUpdateForm(request.POST,instance=request.user)
        c_form=UserDetailsForm(request.POST,request.FILES,instance=request.user.details)
        if c_form.is_valid() and u_form.is_valid():
            c_form.save()
            u_form.save()
            username = u_form.cleaned_data.get('username')
            messages.success(request, f'Information updated for {username}!')
            return redirect('intro')
    else:
        u_form=UserUpdateForm(instance=request.user)
        c_form=UserDetailsForm(instance=request.user.details)

       
    context={
      'c_form':c_form,
      'u_form':u_form
    }
    return render(request,'newapp/details.html',context)



@login_required
def main(request):
  
  
  
  #list = get_object_or_404 ( student, pk=student_id)
  
  
  return render(request,'newapp/mini_main.html')  

  
@login_required
def result(request):
  
  print("\n\nget_full_path:"+str(request.get_full_path)+"\n\npath:"+str(request.path)+"\n\nurl:"+"\n\n")
  temp=Mcount.objects.last()
  temp.check+=1
  temp.save()
  
  fileobj=request.FILES['image2']
  print("\n\nfileobj")
  print(fileobj)

  fs=FileSystemStorage()
  filename=fs.save(fileobj.name,fileobj)

  print("\n\nfilepath1")
  print(filename)
  filepathname=fs.url(filename)
  testimage='..'+filepathname

  print("\n\nfilepath2")
  print(filepathname)
  print("\n\ntestimage")
  print(testimage)

  img=image.load_img(filepathname.replace('%20',' ')[1:], target_size=(img_height, img_width))         #needs tobe checked
  x = image.img_to_array(img)
  x=x/255
  x=x.reshape(1,img_height, img_width,3)

  img=image.load_img(filepathname.replace('%20',' ')[1:], target_size=(224, 224))
  y = image.img_to_array(img)
  y=y/255
  y=y.reshape(1,224, 224,3)

  with model_graph.as_default():
    with tf_session.as_default():

      #4class-1
      predi=model.predict(x)
      classes={0:'Opacity', 1:'Pneumonia', 2:'Normal', 3:'Covid'}
      
      ans=classes[np.argmax(predi[0])]
      finalans=ans
     

















  if finalans == 'Covid':
    temp.covid+=1
    temp.save()
  elif finalans == 'Pneumonia':
    temp.pneum+=1
    temp.save()
  elif finalans == 'Normal':
    temp.normal+=1
    temp.save()
  else:
    temp.other+=1
    temp.save()

  xray_instance=Xray.objects.create(user=request.user,image=fileobj,date=datetime.datetime.now())
  result_inst=Xray_result.objects.create(xray=xray_instance,result=finalans+" positive")
  context={
    'fileobj':filepathname,
    'ans0':result_inst.result,
  
  }

  return render(request,'newapp/result.html',context)



def pdfresult(request):
  
  xray_instance=Xray.objects.filter(user=request.user).last()
  result_inst=Xray_result.objects.filter(xray_id=xray_instance.id).last()
  user_inst=User.objects.filter(id=xray_instance.user_id).last()
  detail_inst=Details.objects.filter(user_id=user_inst.id).last()
  print("\n\n"+str(xray_instance.image)+"\n\n")
  temp=Xray.objects.last()


  context={
      'email':'coviddetect@gmail.com',
      'contact':'9xxxxxxxxxx7',
      'username':xray_instance.user,
      'firstname':user_inst.first_name,
      'lastname':user_inst.last_name,
      'Age':detail_inst.age,
      'gender':detail_inst.gender,
      'ans0':result_inst.result,
      'Datetime':xray_instance.date,
      'filepathname':xray_instance,
      'reportno':temp.id
  }
  response=HttpResponse(content_type='application/pdf')
  response['content-disposition']='attachment;filename="report.pdf"'
  template=get_template('newapp/pdfresult.html')
  html=template.render(context)
  pisa_status=pisa.CreatePDF(
    html,dest=response)
  if pisa_status.err:
    return HttpResponse('We had some errors<pre>'+html+'</pre>')
  
  return response
  

# Create your views here.

