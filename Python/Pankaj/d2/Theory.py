a=34
print(type(a))

a=[10,23,45,7]
print(a[2],len(a))

for i in a:
    print(i,end=" ")

print()
for i in range(len(a)):
    print(a[i],end=" ")

print(a[-4])
# a[0]=1
print(a[0:10])

print(len(a))

print("check:")
for i in range(len(a)-1,-1,-1):
    print(a[i],end=" ")
print()

for i in range(1,len(a)+1):
    print(a[-i],end=" ")
print()

print(a[::-1])

for i in a[::-1]:
    print(i,end=" ")