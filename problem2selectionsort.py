def lowestpos(mylist,start):
    low=mylist[start]
    lowestpos=start
    for i in range(start+1,len(mylist)):
        if low>mylist[i]:
            low=mylist[i]
            lowestpos=i
    return lowestpos

def swap(mylist,x,y):
    temp=0
    temp=mylist[x]
    mylist[x]=mylist[y]
    mylist[y]=temp

mylist=list(map(int,input().split()))

for i in range(len(mylist)-1):
    if mylist[i]>mylist[lowestpos(mylist,i+1)]:
        swap(mylist,i,lowestpos(mylist,i+1))

print(mylist)
