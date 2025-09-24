from django.urls import path

from . import views

urlpatterns = [
    path("home/",views.myfunc,name="home"),
    path('login/',views.login,name="login page"),
    path("submit/",views.success,name="successful"),
    path("factorial/",views.fact,name="factorial"),
    path('ans/',views.ans,name="ans of fact")

]
