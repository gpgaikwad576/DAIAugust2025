
'''day3
List and array: random delete and insert operation is slow'''
import math

# # Data Types, Variables, Operators, Input/Output
# x = 10            # integer
# y = 3.14          # float
# name = "Alice"    # string
# is_active = True  # boolean
#
# print("Enter your age:")
# age = int(input())  # input/output
#
# sum_xy = x + y     # operator example
# print("Sum:", sum_xy)
#
# # Declaring variable, data types in programs
# a = 5          # integer
# b = "hello"    # string
# c = 2.5        # float
#
# # Flow of Control (Modules, Branching)
# import math     # module example
# print(math.sqrt(16))
#
# # If, If-else, Nested if-else
# num = 7
# if num > 0:
#     print("Positive")
# elif num == 0:
#     print("Zero")
# else:
#     print("Negative")
#
# # Nested if-else
# score = 85
# if score >= 50:
#     if score >= 80:
#         print("Excellent")
#     else:
#         print("Pass")
# else:
#     print("Fail")
#
# # Looping: For, While
# for i in range(3):
#     print("For loop:", i)
#
# count = 0
# while count < 3:
#     print("While loop:", count)
#     count += 1
#
# # Nested loops
# for i in range(2):
#     for j in range(2):
#         print(f"i={i}, j={j}")
#
# # Control Structure: Break & Continue
# for i in range(5):
#     if i == 3:
#         break
#     print("Break example:", i)
#
# for i in range(5):
#     if i % 2 == 0:
#         continue
#     print("Continue example:", i)
#
# ###list practice
# a=34
# print(type(a))
#
# a=[10,23,45,7]
# print(a[2],len(a))
#
# for i in a:
#     print(i,end=" ")
#
# print()
# for i in range(len(a)):
#     print(a[i],end=" ")
#
# print(a[-4])
# # a[0]=1
# print(a[0:10])
#
# print(len(a))
#
# print("check:")
# for i in range(len(a)-1,-1,-1):
#     print(a[i],end=" ")
# print()
#
# for i in range(1,len(a)+1):
#     print(a[-i],end=" ")
# s1 = "listen"
# print()
#
# print(a[::-1])
#
# for i in a[::-1]:
#     print(i,end=" ")




########################################################################
# #swap case without swapcase()
# a="heLLo"
# l = []
# for c in a:
#     if c.islower(): l.append(c.upper())
#     elif c.isupper(): l.append(c.lower())
#     else: l.append(c)
# print(''.join(l))
# print()
#
#
# #compress aaaabbbccc->a4b2c3
# str = 'aaaabbbccc'
# d={}
# for c in str:
#     if c not in d: d[c]=1
#     else: d[c] = d[c]+1
#
# print(d)
# for k,v in d.items():
#     print(k,end='')
#     print(v,end='')
# print()

# check anagram
# s2 = "silent"
# d1, d2 = {}, {}
# if (len(s1) != len(s2)): print("Not an Anagram")
# for c in s1:
#     if (c not in d1):
#         d1[c] = 1
#     else:
#         d1[c] += 1
#
# for c in s2:
#     if (c not in d2):
#         d2[c] = 1
#     else:
#         d2[c] += 1
#
# count = 0
# for c1 in d1:
#     if (d1[c1] == d2[c2]):
#         count += 1
# if (count == len(s1)):
#     print("Its Anagram")
# else:
#     print("Not an Anagram")


#remove dupli char
# str = "abacdc"
# d1={}
# l = []
# for c in str:
#     if(c not in l): l.append(c)
# print(''.join(l))
#
# #5. longest word in sent
# sent = " this is very godgfgfod day"
# l = sent.strip().split(" ")
# mx=float('-inf')
# mxw='@'
# c=0
# for w in l:
#     c = len(w)
#     if(c> mx):
#         mxw = w
#         mx =c
# print(mxw)
#
#
#6. find al vowel and their count
# sent = " this is very godgfgfod day"
# counta,counte,coubti,counto,countu=0,0,0,0,0
# for w in sent:
#     if(w == 'a' or w=='A'):
#         counta+=1
#     if (w == 'e' or w == 'i'):
#         a[0] += 1
#     if (w == 'i'):
#         a[0] += 1
#     if (w == 'o'):
#         a[0] += 1
#     if (w == 'u'):
#         a[0] += 1
#     if (w == 'A'):
#         a[0] += 1
#     if (w == 'E'):
#         a[0] += 1
#     if (w == 'I'):
#         a[0] += 1
#     if (w == 'O'):
#         a[0] += 1
#     if (w == 'U'):
#         a[0] += 1


###day3
d = {}
d=dict()
d.clear()
d={1:2,2:3,3:4}

for i in d.values(): #d.keys()
    print(i,end=" ")
print(d.get(2))   #X d[2]
# print(d.popitem())
# print(d.pop(1))
p=[10,20,30]
p=dict.fromkeys(p)
print(p)
p[2]="hi"

d.setdefault(4,'abc')
d.setdefault(1,'abc')
print(d)


sent="This is my school ans school is better"
l= sent.split(" ")
d={}
for w in l:
    if(w not in d): d[w]=1
    else: d[w]+=1
print(d)

#L = ['abc','mno','aaaa','pqr','mnop'] first letter = key values as words startin wit it
l = ['abc','mno','aaaa','pqr','mnop']
d={}
for w in l:
    d.setdefault(w[0],[]).append(w)
print(d)


#Invert the dictionary
ip = {1:'A',3:'B',5:'C',6:'A',7:'B'}
#op = {'A':[1,6],.......}
ivd={}
for k,v in ip.items():
    ivd.setdefault(v,[]).append(k)
print(ivd)


#######################################################
######day4
def add(*a):
    ans =0
    for i in a:
        ans += math.pow(i,2)
    return ans

def callfun():
    add(1, 2, 3, 4)

print(callfun())

##takes array and  splitting factor and splits the array
def fun(arr,s):
    l=[]
    for i in range(0,len(arr),s):
        t=[]
        for j in range(i,i+s):
            t.append(arr[j])
        l.append(t)
    return l

def fun2(arr,s):
    l=[]
    li=-1
    for i in range(0,len(arr)):
        if((i+s)%s ==0):
            l.append([])
            li+=1
        l[li].append(arr[i])
    return l

print(fun2([1,2,3,4,5,6],2))

## function which will find the key with maximum value
def fun(d):
    mx=float('-inf')
    if(len(d) ==0):
        return false
    for k,v in d.items():
        if(v > mx):
            mx = v
            mk=k
    return mk

print(fun({'A':1,'B':3}))

##4.
##take expression as string arguement

def  ispanagram(str):
    s=set()
    for i in str:
        if(i.isalpha()): s.add(i)
    return len(s)==26

def  ispanagram2(str):
    s=set()
    for i in str:
        if(i.isalpha()): s.add(i)
    return len(s)==26
print("is it Panagram:" , ispanagram('dfdh dfdjfkdfj sdsd'))

##5.




