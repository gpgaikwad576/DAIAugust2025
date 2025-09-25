from django.shortcuts import render
from django.http import HttpResponse,JsonResponse
from django.core.serializers import serialize
from Employee.models import getEmployee,display_employee,updateemp,delete
import json

def main(request):
    return render(request,"Main.html")

def create(request):
    return render(request,"Create.html")

def read(request):
    json_data=serialize('json',display_employee())
    print(json_data)
    return render(request,"Read.html",context={"emp":display_employee()})
    

def update(request):
    if request.method == "POST":
        try:
            empid = int(request.POST.get("empid"))
        except Exception as e:
            return render(request, "Update.html", {"error": "Employee id must be integer"})
        empname = str(request.POST.get("empname"))
        empsalary = float(request.POST.get("empdsalary"))
        if empid and empname and empsalary:
            employee = {"id": empid, "name": empname, "salary": empsalary}
            updateemp(employee)  # Call your model function to update
            return render(request, "Update.html",{"emp":employee})  # Redirect or show success
        else:
            return render(request, "Update.html", {"error": "All fields required", "emp": employee})
    else:
        return render(request, "Update.html")


    
def Delete(request):
    if request.method=="POST":
        try:
            empid=int(request.POST.get("empid"))
        except Exception as e:
            return render(request,"Delete.html",{"error":"Employee id must be integer"})
        print(empid,type(empid))
        d=delete(empid)
        if d!=None:
            return render(request,"Delete.html",{"res":d})
        else: 
            return render(request,"Delete.html",{"id":empid})
    else:
        return render(request,"Delete.html")


def insert(request):
    empid=int(request.POST.get("empid"))
    empname=str(request.POST.get("empname"))
    empsalary=float(request.POST.get("empdsalary"))

    employee={"id":empid,"name":empname,"salary":empsalary}
    getEmployee(employee)
    return render(request,"Main.html")


def getemp(request):
    return JsonResponse({"Empid":1,"Empname":"Anurag"})


