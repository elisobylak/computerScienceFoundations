__author__ = 'eli'

for x in range(0, 1):
    import time
    f = open('results.txt', 'a')
    times = []

    def main():
        timeStart = time.clock()
        times.append(timeStart)
        num = x #int(input("Please enter an integer: \n"))
        result = sobylak(num)
        print('The result of' ,num, 'is' ,result)


    def sobylak(num):
        if num == 0:
            return 1
        else:
             num = (sobylak(num-1)^2 * num^2)
             print num
             return num

    main()


    timeEnd = time.clock()
    times.append(timeEnd)
    totalTime = times[1] - times[0]

    tt= str(totalTime)
    f.write(tt + '\n')

    print totalTime

