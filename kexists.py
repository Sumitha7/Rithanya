N,K=map(int,input().split())
n=list(map(int,input().split()))
for i in range(len(n)):
    if n[i]==K:
        print("yes")
        break
else:
    print("no")
