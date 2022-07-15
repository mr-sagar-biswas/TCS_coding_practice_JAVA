def closest_element(arr,start,end,element):
    mid=start+(end-start)//2
    if(arr[mid]==element):
        return mid
    if start<end:
        if(element<arr[mid] and element>arr[mid-1]):
            if abs(element-arr[mid]) < abs(element-arr[mid-1]):
                return mid
            else:
                return mid-1
        if(element>arr[mid] and element<arr[mid+1]):
            if abs(element-arr[mid])<abs(arr[mid+1]):
                return mid
            else:
                return mid+1
        if arr[mid]>element:
            return closest_element(arr,start,mid-1,element)
        elif arr[mid]<element:
            return closest_element(arr,mid+1,end,element)
    if start==end:
        return start


a=[5,7,9,11,13,16,20,21,23]
print(closest_element(a,0,len(a)-1,23))
