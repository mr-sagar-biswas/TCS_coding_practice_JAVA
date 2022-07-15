def armstrong_number(num):
    num_list=list(map(int,str(num)))
    n=len(num_list)
    sum_num=0
    for i in range(n):
        sum_num=sum_num+num_list[i]**n
    if sum_num==num:
        return True
    else:
        return False

num=int(input())
print(armstrong_number(num))
