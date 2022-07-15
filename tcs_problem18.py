arr=list(map(int,input().split()))
print(arr)

arr2=set(arr)

"""
arr2=[]
for i in arr:
    if i not in arr2:
        arr2.append(i)
print(arr2)
"""

for i in arr2:
    print(i,arr.count(i))

"""

for i in arr2:
    count=0
    for j in range(len(arr)):
        if i==arr[j]:
            count+=1
    print(i,count)
"""
