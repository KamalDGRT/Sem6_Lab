'''
    Question 03:
    Write python code to add two numbers without using plus operator.

    My Solution: 
'''

a = 5
b = 3

while(b != 0):
    c = a & b
    a = a ^ b
    b = c << 1
    print(c)
    print(a)
    print(b)

# a has the final result of a + b
