import re
from sys import breakpointhook

# 10. Write a pogram to create a list of prime numbers from 2 to 100


l=[]
for num in range(2,100):
    if num==2:
        l.append(num)
    elif num%2!=0:
        for i in range(2,num//2):
            if num%i==0:
                break
        else:
            l.append(num)

print(l)
