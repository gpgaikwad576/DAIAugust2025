from django.db import models

# Create your models here.

class Employee(models.Model):
    empid=models.IntegerField(default=0,primary_key=True)
    empname=models.CharField(max_length=200)
    empsalary=models.FloatField()

    def __str__(self):
        return f"EmpId:{self.empid},EmpName:{self.empname},EmpSalary:{self.empsalary}"
    


def getEmployee(e):
        Employee(e["id"],e["name"],e["salary"]).save()
        print("Successful")


def insert_employee(e):
    try:
        Employee(e["empid"], e["ename"], e["salary"]).save()
    except Exception as e:
        print("Internal Error: ",e)


def display_employee():
    #print("Inside the display_employee fun inside the models")
    return Employee.objects.all()

def updateemp(employee):
    e=Employee.objects.get(empid=employee["id"])
    e.empname=employee["name"]
    e.empsalary=employee["salary"]
    e.save()
    print("Inside Update function from models")

def delete(id):
    print(id,type(id))
    print("inside the delete function from models")
    try:
        Employee.objects.get(empid=id).delete()
    except Exception as e:
        return "Id Not Exist"
