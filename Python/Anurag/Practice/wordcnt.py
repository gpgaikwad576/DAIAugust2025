import re

s="""This is my class
    This is python class
    there are sixty students in class there  
    """
l=re.split("[ \n]",s)
l=[word for word in l if word]

l.sort()
print(l)
res=[]
cnt=1
for i in range(1,len(l)):
    if l[i]==l[i-1]:
        cnt+=1
    elif l[i]!=l[i-1]:
        res.append([l[i-1],cnt])
        cnt=1


if l[-1]==l[-2]:
    print(res.append([l[-1],cnt]))
else:
    res.append([l[-1],1])

res.sort(reverse=True,key=lambda x :x[-1])
print(res[0])
