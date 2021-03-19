'''
    Question 01:
    Write python code to find out the roots of quadratic equation. 
    Your output should be in complex number format.

    Question Author's Solution: 
'''

a = int(input())
b = int(input())
c = int(input())
x = (-b + ( ( (b * b) - 4 * a * c) ** 0.5) ) / (2 * a)
y = (-b - ( ( (b * b) - 4 * a * c) ** 0.5) ) / (2 * a)
print('The roots of the quadratic equation is {0} and {1}'.format(x, y))
