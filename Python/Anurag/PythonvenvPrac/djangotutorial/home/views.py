from django.shortcuts import render
from django.http import HttpResponse
import sys
# Create your views here.

sys.set_int_max_str_digits(1000000000)
def myfunc(request):   
    return render(request,'home.html')

def login(request):
    return render(request,"login.html")

def success(request):
    print(request.POST.get("username"))
    print(request.POST.get("password"))
    return render(request,"submit.html")

def fact(request):
    return render(request,"factorial.html")

def ans(request):
    f=int(request.POST.get("user_number"))
    ans=1
    for i in range(1,f+1):
        ans*=i
    context={"Number":f,"result":ans}
    return render(request,"factorial.html",context)
