import time

__author__ = 'eli'

word = input("Please enter an integer: ")
print word

#startTime = time()

def syrnum(n):
    num = n
    list = []
    while num > 1:
        list.append(num)
        if num % 2 == 0:
            num = num / 2
        else:
            num = num * 3 + 1
    print list

count = word
while count > 0:
    syrnum(count)
    count -= 1

time.strftime("%S")
endTime = time()

print endTime - startTime
