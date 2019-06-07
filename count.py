N,K=map(int,input().split())
n=list(map(int,input().split()))
c=0
for i in range(len(n)):
    if n[i]==K:
        c=c+1
print(c)
