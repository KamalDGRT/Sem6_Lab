'''
    Question 01:
    Write python code to find out the roots of quadratic equation. 
    Your output should be in complex number format.

    My Solution: 
'''

a = int(input())
b = int(input())
c = int(input())
d = (b ** 2) - (4 * a * c)
x = (-b + d ** 0.5) / (2 * a)
y = (-b - d ** 0.5) / (2 * a)
print('The roots of the quadratic equation is {0} and {1}'.format(x, y))
