# Data Types, Variables, Operators, Input/Output
x = 10            # integer
y = 3.14          # float
name = "Alice"    # string
is_active = True  # boolean

print("Enter your age:")
age = int(input())  # input/output

sum_xy = x + y     # operator example
print("Sum:", sum_xy)

# Declaring variable, data types in programs
a = 5          # integer
b = "hello"    # string
c = 2.5        # float

# Flow of Control (Modules, Branching)
import math     # module example
print(math.sqrt(16))

# If, If-else, Nested if-else
num = 7
if num > 0:
    print("Positive")
elif num == 0:
    print("Zero")
else:
    print("Negative")

# Nested if-else
score = 85
if score >= 50:
    if score >= 80:
        print("Excellent")
    else:
        print("Pass")
else:
    print("Fail")

# Looping: For, While
for i in range(3):
    print("For loop:", i)

count = 0
while count < 3:
    print("While loop:", count)
    count += 1

# Nested loops
for i in range(2):
    for j in range(2):
        print(f"i={i}, j={j}")

# Control Structure: Break & Continue
for i in range(5):
    if i == 3:
        break
    print("Break example:", i)

for i in range(5):
    if i % 2 == 0:
        continue
    print("Continue example:", i)