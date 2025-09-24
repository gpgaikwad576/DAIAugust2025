from django.db import models

# Create your models here.

class Employee(models.Model):
    empid=models.IntegerField(default=0,primary_key=True)
    empname=models.CharField()
    empsalary=models.FloatField()

    # def __str__(self):
    #     return f"EmpId:{self.empid},EmpName:{self.empname},EmpSalary:{self.empsalary}"
    


def getEmployee(e):
    Employee(e["id"],e["name"],e["salary"]).save()
    print("Successful")

def display_employee():
    print("Inside the display_employee fun inside the models")
    return Employee.objects.all()
