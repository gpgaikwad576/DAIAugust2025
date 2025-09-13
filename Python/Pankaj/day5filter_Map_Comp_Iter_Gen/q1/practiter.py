def fact(i):
    result =1
    for j in range(1,i+1):
        result*=j
    return result

def isprime(i):
    if i==2:
        return True
    for j in range(2, i//2+1):
        if(i!=j and i%j ==0): return False
    return True


lst = [i for i in range(1,11)]
itr = iter(lst)
for i in range(len(lst)):
    print(next(itr), end =" ")
print()

lst = (i for i in range(1,11))
while True:
    try:
        print(next(lst),end=" ")
    except StopIteration:
        break
print()
print()

print([i for i in range(1,101) if i%2 ==0])
print([i for i in range(1,101) if (i<=50 and i%2 ==0) or (i >=51 and i%2 !=0)])
print([fact(i) for i in range(1,11)])
print([i for i in range(2,100) if isprime(i)])

print()
s= set((1,2,3,4,8,8,6,6))
itr = iter(s)
# for i in range(len(s)):
#     print(next(itr) ,end=" ")
#
# print()

while(True):
    try:
        print(next(itr),end=" ")
    except StopIteration:
        break

gen =(x for x in s)
while(True):
    try:
        print(next(gen),end="")
    except StopIteration:
        break









