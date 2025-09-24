from django.shortcuts import render
from django.http import HttpResponse
from Employee.models import getEmployee,display_employee

def main(request):
    return render(request,"Main.html")

def create(request):
    return render(request,"Create.html")

def read(request):
    return render(request,"Read.html",context={"emp":display_employee()})
    

def Update(request):
    return render(request,"Update.html")

def Delete(request):
    return render(request,"Delete.html")


def insert(request):
    empid=int(request.POST.get("empid"))
    empname=str(request.POST.get("empname"))
    empsalary=float(request.POST.get("empdsalary"))

    employee={"id":empid,"name":empname,"salary":empsalary}
    getEmployee(employee)
    return render(request,"Main.html")



