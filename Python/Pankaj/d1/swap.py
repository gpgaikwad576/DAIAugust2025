


ans = "ans"
if a > b:
    print("inside a")
elif (b > a and ans == "ans"):
    print("in elif")
else:
    print("in else")

marks = 234
if (marks < 200):
    print("fail")
elif (marks == 234):
    print("great")
else:
    print("you dont need class")

i = 1
while (i <= 5):
    print(i, end=" ")
    i += 1

# add all numbers from 1 to 10
i = 1
ans = 0
for i in range(11):
    ans += i
print(ans)
print()

# print all from 100 to 1
i = 1
ans = 0
for i in range(100, 0, -1):
    print(i, end=" ")
print()

# using single loop even in 1 to 50, ofdd in 51 to 100
i = 1

while (i <= 100):
    if (i <= 50 and i % 2 == 0): print(i, end=" ")
    if (i >= 51 and i % 2 != 0): print(i, end=" ")
    i += 1

print()
# factorial of given number
i = 5
ans = 1
while (i >= 2):
    print("hi", i)
    ans *= i
    i -= 1
else:
    print("else after loop")
print(ans)

# continue,break,pass-no effect-will write later
# find if a given number i s prime
n = 54
for i in range(2, n // 2):
    if (n % i == 0):
        print("It is composite")
        break
else:
    print("prime")
