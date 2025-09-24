"""newproject URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/3.2/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""

from django.contrib import admin
from django.urls import path,include
from django.contrib.auth import views as auth_views
from .import views
from django.conf.urls import url
#from .models import Mcount


urlpatterns = [
    
    path('',views.intro,name='intro'),
    path('login/',auth_views.LoginView.as_view(template_name='newapp/mini_login.html'),name='login'),
    path('logout/',auth_views.LogoutView.as_view(template_name='newapp/logout.html'),name='logout'),
    path('register/',views.register,name='register'),
    path('main/',views.main,name='main'),
    path('details/',views.details,name='details'),
    path('pdfresult/',views.pdfresult,name='pdfresult'),
    path('details/',views.details,name='details'),
    url('result',views.result,name='result'),
    path('password_reset/',auth_views.PasswordResetView.as_view(template_name='newapp/password_reset.html'),name='password_reset'),
    path('password_reset_complete/',auth_views.PasswordResetCompleteView.as_view(template_name='newapp/password_reset_complete.html'),name='password_reset_complete'),
    path('password_reset/done/',auth_views.PasswordResetDoneView.as_view(template_name='newapp/password_reset_done.html'),name='password_reset_done'),
    path('password_reset_confirm/<uidb64>/<token>/',auth_views.PasswordResetConfirmView.as_view(template_name='newapp/password_reset_confirm.html'),name='password_reset_confirm'),
    path('accounts/',include('allauth.urls'))
]
