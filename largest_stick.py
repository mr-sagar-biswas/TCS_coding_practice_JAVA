def largest_stick(arr,x,high_hight):
    low_hight=0
    while low_hight<high_hight:
        mid=(low_hight+high_hight)//2
        bundle=0
        for j in range(len(arr)):
            bundle=bundle+arr[j]//mid
            if bundle>=x:
                ans=mid
                low_hight=mid+1
            else:
                high_hight=mid-1
    return ans




def largest(arr,x):
    hight=0
    for i in range(max(arr),-1,-1):
        hight=i
        bundle=0
        for j in range(len(arr)):
            bundle=bundle+arr[j]//hight
        if bundle>=x:
            return new_hight


arr=[15,10,8]
print(largest_stick(arr,4,max(arr)))
