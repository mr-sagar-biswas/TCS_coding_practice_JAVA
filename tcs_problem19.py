def decimalToOctal(n):
    octal=0
    while n!=0:
        rem=n%8
        octal=octal*10+rem
        n=n//8
    return int(str(octal)[::-1])


print(decimalToOctal(269874))
