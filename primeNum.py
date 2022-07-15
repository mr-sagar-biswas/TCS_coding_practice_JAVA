import math
def isPrime(n):
    if n<2 or n%2==0:
        return False
    if n==2:
        return True
    
    for i in range(3,int(math.sqrt(n))+1,2):
        if(n%i==0):
            return False
    return True


n= 17014118
print(isPrime(n))
