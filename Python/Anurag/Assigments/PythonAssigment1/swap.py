a=20
b=30
print(f"a={a},b={b}")
a,b=b,a
print(f"a={a},b={b}")

c=100
d=200
print("\nother way")
print(f"a={c},b={d}")
c=c+d
d=c-d
c=c-d
print(f"c={c},d={d}")