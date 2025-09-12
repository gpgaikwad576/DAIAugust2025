def isPalind(word):
    return lambda w: w ==w[::-1]

def filterPalind(lst):
    return list(filter(isPalind,lst))

def ischardupli(word):
    return len(s)==len(set(s))

def filterchardupli(lst):
    return list(filter(ischardupli,lst))

def isTitle(word):
    return word[0].isUpper()

def applySwapCase(lst):
    return list(map(filter(isTitle),lst))

print(m3.makeSquare([1,2,3,4,5,6,7]))