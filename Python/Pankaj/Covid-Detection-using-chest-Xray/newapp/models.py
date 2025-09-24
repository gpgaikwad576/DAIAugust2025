
from django.db import models
from django.contrib.auth.models import AbstractUser,User
from PIL import Image
from django.conf import settings
import datetime

class Details(models.Model):
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
	
	user=models.OneToOneField(User,on_delete=models.CASCADE)
	image=models.ImageField(default='default.jpg',upload_to='profile_pics')
	age=models.marks = models.DecimalField(max_digits=5, decimal_places=2,null=True)
	gender=models.CharField(max_length=10, choices=genderCHOICES,null=True)
	institute=models.CharField(max_length=1, choices=CHOICES,null=True)
	profession=models.CharField(max_length=1, choices=pro_CHOICES,null=True)
	country=models.CharField(max_length=1, choices=count_CHOICES,null=True)
	address=models.CharField(max_length=200,null=True)
	Contact=models.BigIntegerField(null=True)
	def __str__(self):
		return f'{self.user.username}	Details'
	#USERNAME_FIELD = 'email'
	#REQUIRED_FIELDS = ['firstname', 'lastname','email','age','institute','profession','country','address','Contact']

class Xray(models.Model):
	user= models.ForeignKey(User,on_delete=models.CASCADE)
	date=models.DateTimeField(null=True)
	#image=models.ImageField(default='default.jpg',upload_to='images')
	image=models.ImageField(blank = True, null = True, editable = True)
	def __str__(self):
		return f'{self.user.username}   {self.date}	   Xray_result'
"""
	def save(self, *args, **kwargs):
		super(Xray,self).save(*args, **kwargs)
		img=Image.open(self.image.path)
		if(img.height >300 or img.width>300):
			output_size=(300,300)
			img.thumbnail(output_size)
			img.save(self.image.path)
"""
class Xray_result(models.Model):
	xray= models.OneToOneField(Xray,on_delete=models.CASCADE)
	result=models.CharField(max_length=50,null=True)
	def __str__(self):
		return f'{self.xray.user.username}   {self.xray.date}	   Xray_result'

class Mcount(models.Model):
	date=models.DateTimeField(default=datetime.datetime.now(),null=True)
	check=models.BigIntegerField(null=True)
	covid=models.BigIntegerField(null=True)
	pneum=models.BigIntegerField(null=True)
	normal=models.BigIntegerField(null=True)
	other=models.BigIntegerField(null=True)

