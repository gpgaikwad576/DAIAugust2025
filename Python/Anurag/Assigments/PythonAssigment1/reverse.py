# Write a program to reverse a list

l=[10,20,30,40,50]
print(f"List: {l}\n")

s=l[::-1]
print(s)

print("\nOther method")
s=[x for x in l[::-1]]
print(s)

print("\nOther method")
s=[]
for i in range(len(l)-1,-1,-1):
    s.append(l[i])

print(s)