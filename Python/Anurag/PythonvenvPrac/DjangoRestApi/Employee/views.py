from django.shortcuts import render
from rest_framework.views import APIView
from .serializers import EmployeeSerializers
from .models import Employee
from rest_framework.response import Response
from rest_framework import status


# Create your views here.
class EmployeeView(APIView):
    def get(self,request):
        employee=Employee.objects.all()
        serializers=EmployeeSerializers(employee,many=True)
        print(serializers.data)
        return Response(serializers.data)
    
    def post(self,request):
        serializer=EmployeeSerializers(data=request.data)
        if serializer.is_valid():
            serializer.save()
            return Response(serializer.data,status=status.HTTP_201_CREATED)
        
        return Response(serializer.errors, status=status.HTTP_400_BAD_REQUEST)