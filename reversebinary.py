#!/usr/bin/env python

if __name__ == "__main__":

    decimalNumber = raw_input()

    try:
        decimalNumber = int(decimalNumber)

        if decimalNumber >= 1 and decimalNumber <= 1000000000:

            print "%s" % int(str(bin(int(decimalNumber))).replace('0b','')[::-1],2)
        else:
            raise
            
    except Exception:
        print "Invalid input"