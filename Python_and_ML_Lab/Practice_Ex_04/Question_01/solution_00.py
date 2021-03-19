'''
    Question 01:
    Write python code to swap two numbers using a random temporary variable.

    Question Author's Solution: 
'''

x = int(input())
y = int(input())
temp = x
x = y
y = temp
print('The value of x after swapping: {}'.format(x))
