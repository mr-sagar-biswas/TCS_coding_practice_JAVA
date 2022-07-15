def long_common_subseq(x,y,m,n):
    if m==0 or n==0:
        return 0
    elif x[m-1]==y[n-1]:
        return 1+long_common_subseq(x,y,m-1,n-1)
    elif x[m-1]!=y[n-1]:
        return max(long_common_subseq(x,y,m,n-1),long_common_subseq(x,y,m-1,n))
    


list1=list(input())
list2=list(input())
print(long_common_subseq(list1,list2,len(list1),len(list2)))
