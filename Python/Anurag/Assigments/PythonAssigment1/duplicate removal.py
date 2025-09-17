l=[1,2,3,4,5,5,6,7,1,1,21,34,34]
l.sort()
print(l)
res=[l[0]]
for i in range(1,len(l)):
    if l[i]!=l[i-1]:
        res.append(l[i])


print(res)