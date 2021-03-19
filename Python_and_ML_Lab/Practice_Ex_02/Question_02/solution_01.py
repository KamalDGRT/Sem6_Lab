'''
    Question 02:
    Write a python code to add two numbers using input() function.

    My Solution: 
'''

a = float(input())
b = float(input())

if a.is_integer():
    a = int(a)

if b.is_integer():
    b = int(b)

print("The sum of " + str(a) + " and " + str(b) + " is " + str(float(a + b)))
