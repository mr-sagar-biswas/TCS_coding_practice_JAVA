def largest(arr,maxnum,i):
    if i==len(arr)-1:
        return arr[i]
    if arr[i]>largest(arr,maxnum,i+1):
        return arr[i]
    else:
        return largest(arr,maxnum,i+1)

a=[2,5,12,4,2,3,10,18,15236,2,3,9,10]
print(largest(a,0,0))
