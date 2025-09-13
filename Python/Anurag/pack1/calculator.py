def add(*args):
    sum=0
    for i in args:
        sum+=i
    return sum

def mutliply(*args):
    res=1
    for i in args:
        res*=i
    return res

def factorial(n):
    res=1
    for i in range(n,0,-1):
        res*=i
    return res


