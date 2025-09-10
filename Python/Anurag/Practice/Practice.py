# # create dict from 2 list
#
# l1=[1,2,3,4,5,6]
# l2=["asas",'sasa','sa',"class","here","the"]
#
# d={}
# for i in range(len(l1)):
#     d[l1[i]]=l2[i]
#
# print(d)
#
#
# # find the len of the dict
# cnt=0
# for i in d.keys():
#     cnt+=1
# print(f"length:{cnt}")
#
# # find out vowels count in given string
# s="find out vowels count in given string"
# vowels="a e i o u".split()
# res={}
# for i in s:
#     if i in vowels:
#         if i in res:
#             res[i]+=1
#         else:
#             res[i]=1
#
# print(res)
#
#
# # employee salary
#
# emp={"abc":99000,"xyz":78000,"def":40000}
#
# for key in emp.keys():
#     if emp[key]<50000:
#         emp[key]=emp[key] + (emp[key]*10)/100
#
# print(emp)
#
#
#
# #list of tuple
# l=[("a",1),("b",2),("c",3),("d",4)]
#
# u={}
# for item in l:
#     u[item[0]]=item[1]
#
# # print(u)
# print(ord(" "))
# print(ord("d")-ord("a"))

# s="The Quick brown Fox jumps over the lazy dog"
# l=[0]*26
# for i in s:
#     if i!=" ":
#         if l[ord(i.lower())-ord('a')]==0:
#             l[ord(i.lower()) - ord('a')]+=1
# cnt0=0
# for i in l:
#     if i==0:
#         cnt0+=1
#
# if cnt0!=0:
#     print("Not a Panagram")
# else:
#     print("Panagram")


s="Pnrfne pvcure V zhpu cersre Pnrfne fnynq"
key = {'a':'n', 'b':'o', 'c':'p', 'd':'q', 'e':'r', 'f':'s', 'g':'t', 'h':'u', 'i':'v', 'j':'w', 'k':'x', 'l':'y',
'm':'z', 'n':'a','o':'b',
'p':'c', 'q':'d', 'r':'e', 's':'f', 't':'g', 'u':'h', 'v':'i', 'w':'j', 'x':'k', 'y':'l', 'z':'m', 'A':'N', 'B':'O',
'C':'P', 'D':'Q','E':'R',
'F':'S', 'G':'T', 'H':'U', 'I':'V', 'J':'W', 'K':'X', 'L':'Y', 'M':'Z', 'N':'A', 'O':'B', 'P':'C', 'Q':'D', 'R':'E',
'S':'F', 'T':'G', 'U':'H', 'V':'I', 'W':'J', 'X':'K', 'Y':'L', 'Z':'M'}
res=[]
for i in s:
    if i !=" ":
        res.append(key[i])
    elif i==" ":
        res.append(" ")

print("".join(res))
