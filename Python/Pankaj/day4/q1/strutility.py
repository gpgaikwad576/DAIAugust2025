def countwords(str):
    return len(str.split(" "))

def countvowels(str):
    cnt=0
    for i in str:
        if(i in ('a','e','i','o','u','A','E','I','O','U')):
            cnt+=1
    return cnt

def cntuniquewords(str):
    s= set(lambda word:word.lower() for w in str.split(" "))
    return len(s)

def getLongestWord(str):
    cnt=0
    mxcnt=0
    lw=''
    for w in str.split(" "):
        if(mxcnt<len(w)):
            mxcnt = len(w)
            lw = w

    return lw

def getShortestWord(str):
    cnt = 0
    mincnt = 0
    mw = ''
    for w in str.split(" "):
        if (mincnt < len(w)):
            mincnt = len(w)
            mw = w

    return mw

def getCommonWord():
    d={}
    for w in str.split(" "):
        if(w not in d):
            d[w] =1
        else:
            d[w]+=1

