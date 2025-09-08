import math
fruits = ["apple", "banana", "cherry", "kiwi", "mango"]

fruits=[fruits[x].upper() if x%2==0 else fruits[x] for x in range(0,len(fruits))]

s=" ".join(fruits)

tuple1 = ("a", "b" , "c")
tuple2 = (1, 2, 3)

print(id(tuple1))
tuple1 = tuple1 + tuple2
print(tuple1)
print(id(tuple1))

# def isprime(n):
#     if n==1:
#         return False
#     elif n==2:
#         return True
#     else:
#         for i in range(3,int(math.sqrt(n))+1):
#             if n%i==0:
#                 return False
            
#         else:
#             return True 
        
# for i in range(1,201):
#     if isprime(i) and i%2!=0:
#         print(i)
    





