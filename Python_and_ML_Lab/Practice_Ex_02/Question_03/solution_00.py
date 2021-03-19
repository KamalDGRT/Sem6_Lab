'''
    Question 03:
    Write python code to add two numbers without using plus operator.

    Question Author's Solution: 
'''

def add_without_plus(a, b):
    while b != 0:
        data = a & b
        print(data)
        a = a ^ b
        print(a)
        b = data << 1
        print(b)
    return a

add_without_plus(5, 3)
