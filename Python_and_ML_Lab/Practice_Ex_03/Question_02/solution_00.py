'''
    Question 02:
    Write python code to find the area of triangle using Heron's formula.

    Question Author's Solution: 
'''

a = int(input())
b = int(input())
c = int(input())
s = (a + b + c) / 2
area = ( s * (s - a) * (s - b) * (s - c) ) ** 0.5
print('The area of the triangle is %0.2f' %area)
