from django.shortcuts import render
from django.http import HttpResponse
def login(request):
    return render(request,'login.html')

def after_login(request):
    print(request.POST.get('username'))
    print(request.POST.get('password'))

    return HttpResponse("This is after login")

