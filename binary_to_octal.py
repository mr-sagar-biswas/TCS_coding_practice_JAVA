def binary_to_octal(n):
    decimal=0
    i=0
    while n!=0:
        digit=n%10
        decimal=decimal+digit*(2**i)
        i+=1
        n=n//10
    octal=0
    while decimal!=0:
        digit=decimal%8
        octal=(octal*10)+digit
        decimal=decimal//8
    return str(octal)[::-1]
        


print(binary_to_octal(10010110101))
