#!/bin/bash
''' Name: Gregory Moncayo
FSUID: Glm16b
Date: 10/20/2018  
Assignment: Assignment# 2
Due Date: 10/20/2018
About this project: To be familiar with Object Orientated in python 
'''

lis = []
EncList = []

# Greatest common divisor function

def gcd(x, y):
    if (x == 0):
        return y
    return gcd(y % x, x)

# Decorator function for print function

def printFun(func):
    def decrypted():
        print("The decrypted ", end=" ")
        return func()
    return decrypted

def printFunct(funct):
    def encry():
        print("The encrypted ", end=" ")
        return funct()
    return encry

# print function

@printFun
def printFunc():
    r = print("message is", end=" ")
    return (r)

@printFunct
def printFunction():
    r = print("message is", end=" ")
    return (r)

# RSA class

class RSA():

    # Default constructor
    def __init__ (self, e = 0, d = 0):
        self.encryption = e
        self.decryption = d
        list = []
        
    # Input function to the list

    def inputFuc(self, string):
        lis.append(string)
        EncList.append(string)

    # Prints the encryption    
    def printEnc(self):
        print ("N is", self.encryption)

    # Prints the decryption

    def printDec(self):
        print ("e is", self.decryption)

    # finds the next two prime numbers & multiplies them 

    def primeGen(self, n):
        R = RSA()
        p = 0
        q = 0
        e = 0
        for x in range(n, n+n, 1):
            if (R.prime(x)):
                p = x
                break
        for y in range(p+1, p+p, 1):
            if(R.prime(y)):
                q = y
                break
        self.encryption = q*p
        answer = R.totient(self.encryption)
        ans = R.lcd(q-1,p-1)
        tot = (q-1) * (p-1)
        tot = tot / 2
        tot = int(tot)
        for z in range(2, tot, 1):
            if (gcd(z,tot) == 1 and z > 1 and z < tot):
                e = z
            self.decryption = e

    # Key generation function     
    def keyGen(self, n):
        Rizza = RSA()
        Rizza.primeGen(n)
        Rizza.printEnc()
        Rizza.printDec()

    # returns a prime number

    def prime(self, num):
        return all([(num % j) for j in range(2, int(num**0.5)+1)]) and num>1

    # Returns the least common divisor
    
    def lcd(self, a, b):
        return (a *b) / gcd(a,b)

    # totient function

    def totient(self, num):
        answer = 1
        for x in range(2, num):
            if(gcd(x,num) == 1):
                answer = answer + 1
        return answer

    # returns the encryption

    def encrypt(self, number):
        print (printFunction(), EncList[number])

    # returns the decryption

    def decrypt(self, digit):
        print (printFunc(), lis[digit])

    # Ask for user input for number of messages on the screen

    def messages(self):
        rope = RSA()
        number = input("Enter the number of messages: ")
        number = int(number)
        for i in range(0,number):
            message = input("Enter the messages: ")
            rope.inputFuc(message)
        value = input("Enter the minimum value for the prime numbers: ")
        value = int(value)
        rope.keyGen(value)
        for j in range(0,number):
            rope.encrypt(j)
        for a in range(0, number):
            rope.decrypt(a)

# Main function
if __name__ == "__main__":
    r = RSA()
    r.messages();
    

