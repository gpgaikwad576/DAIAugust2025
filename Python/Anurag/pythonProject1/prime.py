# Find if given number is prime or not

x=int(input("Enter the Number:"))

for i in range(2,x//2+1):
    if x==2:
        print("Prime")
        break
    elif (x%i)==0:
        print("Not a Prime")
        break
else:
    print("Prime")