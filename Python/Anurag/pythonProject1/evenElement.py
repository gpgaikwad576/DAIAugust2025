# Write a program to add all even elements in list from 1 to 100

res=[]

for i in range(1,100+1):
    if i%2==0:
        res.append(i)

print(res)

print("\nOther method")

print([x for x in range(1,100+1) if x%2==0])