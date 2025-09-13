def fact(i):
    result =1
    for j in range(1,i+1):
        result*=j
    return result

def isprime(i):
    if i==2:
        return True
    for j in range(2, i//2+1):
        if(i!=j and i%j ==0): return False
    return True


print([i for i in range(1,101)])
print([i for i in range(1,101) if i%2 ==0])
print([i for i in range(1,101) if (i<=50 and i%2 ==0) or (i >=51 and i%2 !=0)])
print([fact(i) for i in range(1,11)])
print([i for i in range(2,100) if isprime(i)])