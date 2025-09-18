import math

# 1. Write a program to swap 2 numbers
a = 5
b = 4
print("Original a=", a)
print("Original b=", b)


a = a + b
b = a - b
a = a - b
print("a=", a)
print("b=", b)

a = 5
b = 4
a = a ^ b
b = a ^ b
a = a ^ b
print("a=", a)
print("b=", b)

#
a = 5
b = 4
a, b = b, a
print("a=", a)
print("b=", b)

print()
# # 2. Write a program to calaculate sum of digits of given three digit number
num = 498
ans = 0
print("Number: ", num)
while (num != 0):
    rem = num % 10
    ans += rem
    num //= 10
print("Sum of digits: " ,ans)
print()

# # 3. Find if given number is even or odd
num =45
print("Number: ", num)
if(num%2 ==0): print("Its Even number")
else: print("Its Odd number")
print()

#
# # 4. Print grade of student based on his marks (e.g. 76 is DISTINCTION 54 is SECOND CLASS 41 is
# # PASS CLASS)
marks = 80
print("Marks: ", num)
if(marks<=41): print("PASS")
elif(marks<=54): print("SECOND CLASS")
elif(marks<=76): print("DISTINCTION")
else:
    print("REMARKABLE")
print()


# # 5. Calculate factorial of number
num = 5
print("Number: ", num)
ans = 1
while (num >= 2):
    ans *= num
    num -= 1
print("Factorial of number: " ,ans)
print()


# # 6. Find if given number is prime or not
n = 54
print("Number: ", n)
for i in range(2, n // 2):
    if (n % i == 0):
        print("It is composite")
        break
else:
    print("It is Prime")
print()

# List: 7. Write a program to reverse a list
l = [1,2,4,6,5,9,8]
print("List: ", l)
#l.reverse()
for i in range(len(l)//2):
    l[i]=l[-i-1]+l[i]
    l[-i-1] = l[i]-l[-i-1]
    l[i] = l[i]-l[-i-1]
print("Reversed List",l)
print()


# 8. Write a program to add all even elements in list from 1 to 100
ans =0
for i in range(1,101):
    if(i%2 == 0): ans+=i
print("addition of all even elements from 1 to 100",ans)
print()

# 9. Write a program to print all odd numbers from list
l = [1,2,4,6,5,9,8]
print("List: ", l)
for i in l:
    if(i%2!=0):
        print(i,end=" ")
print()
print()

# 10. Write a pogram to create a list of prime numbers from 2 to 100
l = []
print(2, end =" ")
for i in range(3,100):
    for j in range(2,i//2+1):
        if(i!=j and i%j==0):
            break
    else:
        print(i, end=" ")
print()
print()

# 11. Remove duplicate elements from list
s = set()
l=[1,1,2,2,3,2,4]
print("List: ", l)
for i in l:
    s.add(i)
print("List after duplicate element removal",s)
print()

# 12. From given list of strings create another list of strings having 2 or more vowels
l1 = ['mango','apple','man']
l2= ['mongo','epple','tan','sane']
print("List1: ", l1)
print("List2: ", l2)
l3=[]
for i in range(len(l1)):
    count=0
    for j in range(len(l1[i])):
        if l1[i][j] in ('a','e','o','u','i','A','E','I','O','U'):
            count+=1
        if(count==2):
            l3.append(l1[i])
            break

for i in range(len(l2)):
    count=0
    for j in range(len(l2[i])):
        if l2[i][j] in ('a','e','o','u','i','A','E','I','O','U'):
            count+=1
        if(count==2):
            l3.append(l2[i])
            break

print("List of strings having 2 or more vowels",l3)
print()

# Tuple; 13. Find out total count of prime numbers and odd numbers in given tuple
l = []
t=(2,3,4,5,6,7,11,13)
print("tuple: ", t)
for i in t:
    for j in range(2,i//2+1):
        if(i!=j and i%j==0):
            break
    else:
        print(i, end=" ")
print()
print()

# 14. Write a program to reverse given string.
s="pankaj"
print("String: ", s)
s2=s[::-1]
print(s2)
print()

# set: 15. Write a program to find if given string is pangram (it should have all characters from a to z)
s1 = 'A quick brown fox jumped over the lazy dog'
print("String: ", s1)
s2= set()
for i in s1:
    if(i.isalpha()):
        s2.add(i)
if(len(s2)==26): print("Its Panagram")
else: print("Its not Panagram")
print()

# Dict:16. Write a program to find if given string is anagram (it should have same charachters in any
# rotation)
s1='listlen'
s2 = "silelnt"
print("Strings: ", s1,s2)
d1, d2 = {}, {}
if (len(s1) != len(s2)): print("Not an Anagram")

for i in range(len(s1)):
    if (s1[i] not in d1):
        d1[s1[i]] = 1
    else:
        d1[s1[i]] += 1

for i in range(len(s1)):
    if (s2[i] not in d1):
        d1[s2[i]] = 1
    else:
        d1[s2[i]] -= 1

for v in d1.values():
    if(v != 0):
        print("Not an Anagram")
        break
else:
    print("Anagram")

print()

# String: 17. Change the case of each vowel in given string (e.g. hEllo should be converted to hellO
# uppercase should be converted to lower and vice versa)
str="hEllo should be converted to hellO"
print("String: ", str)
for i in str:
    if(i in ('a','e','o','u','i','A','E','I','O','U')):
        if(i.islower()):
            print(i.upper(),end="")
        elif (i.isupper()):
            print(i.lower(),end="")
        continue
    print(i,end="")
print()
print()

# 18. Reverse every word in given sentence. ("hello world how are you" should be converted to
# "olleh dlrow woh era uoy")
sent ='hello world how are you'
print("Sentence: ", sent)
print("sentence after every word reversed: ")
# l=sent.split(" ")
# for i in range(len(l)):
#     l[i]= ''.join(reversed(l[i]))
# print(" ".join(l))
# print()
#
# result =[w[::-1] for w in l]
# print(" ".join(result))
print(" ".join(w[::-1] for w in sent.split()))
print()

# ascii: 19. In cryptography, a Caesar cipher is a very simple encryption techniques in which each
# letter in the plain text is replaced by a letter some fixed number of positions down the
# alphabet. For example, with a shift of 3, A would be replaced by D, B would become E, and
# so on. The method is named after Julius Caesar, who used it to communicate with his
# generals. ROT-13 ("rotate by 13 places") is a widely used example of a Caesar cipher
# where the shift is 13. In Python, the key for ROT-13 may be represented by means of the
# following dictionary:
# Your task in this exercise is to implement an encoder/decoder of ROT-13. Once you're
# done, you will be able to read the following secret message:

# Note that since English has 26 characters, your ROT-13 program will be able to both
# encode and decode texts written in English.

key = {'a':'n', 'b':'o', 'c':'p', 'd':'q', 'e':'r', 'f':'s', 'g':'t', 'h':'u', 'i':'v', 'j':'w', 'k':'x', 'l':'y',
'm':'z', 'n':'a','o':'b',
'p':'c', 'q':'d', 'r':'e', 's':'f', 't':'g', 'u':'h', 'v':'i', 'w':'j', 'x':'k', 'y':'l', 'z':'m', 'A':'N', 'B':'O',
'C':'P', 'D':'Q','E':'R',
'F':'S', 'G':'T', 'H':'U', 'I':'V', 'J':'W', 'K':'X', 'L':'Y', 'M':'Z', 'N':'A', 'O':'B', 'P':'C', 'Q':'D', 'R':'E',
'S':'F', 'T':'G', 'U':'H', 'V':'I', 'W':'J', 'X':'K', 'Y':'L', 'Z':'M'}

str="Pnrfne pvcure? V zhpu cersre Pnrfne fnynq!"
print("String:" ,str)
print("Decrypted String: ")
for i in str:
    if(i in key):
        print(key[i],end="")
    else:
        print(i,end="")



