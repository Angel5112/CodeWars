"""
You are given 2 two-digit numbers.
You should check if they are similar by comparing their numbers, and return the result in %.
"""

def similar_digits(x, y):
    x = str(x)
    y = str(y)
    count = 0

    for i in range(0, 2):
        if x[i] in y:
            count += 1

    for i in range(0, 2):
        if y[i] in x:
            count += 1

    if count == 0:
        return "0%"
    elif count >= 1 and count <= 3:
        return "50%"
    else:
        return "100%"    

    

if __name__ == '__main__':
    a = 66
    b = 16
    print(similar_digits(a,b))