def lcm(a,b):
    if a>=b:
        max_num=a
    else:
        max_num=b
    iterator=max_num
    lcm_num=0
    while True:
        if max_num%a==0 and max_num%b==0:
            lcm_num=max_num
            break
        max_num=max_num+iterator
    return lcm_num

def hcf(a,b):
    return (a*b)//lcm(a,b)

print(hcf(50,200))
