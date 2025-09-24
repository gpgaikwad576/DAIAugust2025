from django.db import models

# Create your models here.

class Employee(models.Model):
    empid=models.IntegerField(default=0,primary_key=True)
    empname=models.CharField()
    empsalary=models.IntegerField()

    def __str__(self):
        return f"EmpId:{self.empid},Empname:{self.empname},EmpSalary:{self.empsalary}."
    


