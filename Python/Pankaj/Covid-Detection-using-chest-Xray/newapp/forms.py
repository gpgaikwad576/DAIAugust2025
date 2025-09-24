
from django.contrib.auth.forms import UserCreationForm
from django.contrib.auth.models import User
from django import forms
from .models import Details,Xray
import datetime
from django.shortcuts import render,redirect
from django.http import HttpResponse
from django.conf.urls import url
from django.urls import path
from django.template.loader import get_template
from django.conf import settings
from django.core.files.storage import FileSystemStorage
from django.contrib import messages


class UserDetailsForm(forms.ModelForm):
	genderCHOICES =(
    ("Male", "Male"),
    ("Female", "Female"),
    ("Other", "Other"),
    
	)
	CHOICES =(
	    ("1", "SPIT"),
	    ("2", "VJTI"),
	    ("3", "TATA"),
	    ("4", "Reliance"),
	    ("5", "serum"),
	)

	pro_CHOICES =(
	    ("1", "doctor"),
	    ("2", "nurse"),
	    ("3", "radiologist"),
	    ("4", "Pharmacy"),
	    ("5", "other"),
	)

	count_CHOICES=(
		("1","India"),
		("2","Australia"),
		("3","NewZealand"),
		("4","China"),
		("5","Britain"),
		("6","America"),

	)
	image=forms.ImageField()
	age=forms.marks = forms.DecimalField(max_digits=5, decimal_places=2)
	gender=forms.ChoiceField(choices=genderCHOICES)
	institute=forms.ChoiceField(choices = CHOICES)
	profession=forms.ChoiceField(choices = pro_CHOICES)
	country=forms.ChoiceField(choices = count_CHOICES)
	address=forms.CharField(max_length=200)
	Contact=forms.IntegerField()
	
	class Meta:
		model=Details
		fields=['image','age','gender','institute','profession','country','address','Contact']
	
class UserUpdateForm(forms.ModelForm):
	email=forms.EmailField()
	
	

	class Meta:
		model=User
		fields=['first_name','last_name','username','email']


class UserDetectionForm(UserCreationForm):
	image=forms.ImageField()
	date=forms.DateTimeField()
	"""
	def __init__(self, **kwargs):
		self.user = kwargs.pop(request.user, None)
		super(UserDetectionForm, self).__init__(**kwargs)

	def save(self, commit=True):
		obj = super(UserDetectionForm, self).save(commit=False)
		obj.user = self.user
     
		if commit:
			obj.save()
		return obj
	"""
	
	class Meta:
		model=Xray
		fields=['image','date']


  

class UserRegisterForm(UserCreationForm):
	
	
	email=forms.EmailField()
	
	

	class Meta:
		model=User
		fields=['first_name','last_name','username','email','password1','password2']

   
