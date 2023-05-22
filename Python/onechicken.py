numbers = [int(num) for num in input().split()]
M = numbers[0]
N = numbers[1]
if(N>M):
    str = "Dr. Chaz will have {} piece".format(N-M)
    if(N-M!=1):
        str+="s"
    print(str+" of chicken left over!")
else:
    str = "Dr. Chaz needs {} more piece".format(M-N)
    if(M-N!=1):
        str+="s"
    print(str+" of chicken!")
   