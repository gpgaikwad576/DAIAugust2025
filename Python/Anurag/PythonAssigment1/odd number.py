# Write a program to print all odd numbers from list

l=[10,20,30,40,1,2,3,4]
print([item for item in l if item%2==0])

print("\nOther method")
res=[]
for item in l:
    if item%2==0:
      res.append(item)

print(res)