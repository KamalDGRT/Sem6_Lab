n = int(input("Enter an Odd Input: "))
m = 3 * n
print ("\n")
pattern = [ (( ".|.") * (2 * i + 1)).center(m, '-') for i in range ( n // 2) ]
names = [ 
    "WELCOME" . center (m, '-'), 
    "WELCOME" . center (m, '-') 
]
print('\n'.join(pattern + names + pattern [::-1]))
