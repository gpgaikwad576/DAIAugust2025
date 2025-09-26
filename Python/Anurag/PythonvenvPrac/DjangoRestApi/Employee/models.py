from django.db import models

# Create your models here.
class Employee(models.Model):
    empid=models.IntegerField(default=0,primary_key=True)
    empname=models.CharField(max_length=200,default="")
    empsalary=models.FloatField(default=0.0)