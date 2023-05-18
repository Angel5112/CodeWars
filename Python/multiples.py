"""
Create a function with two arguments that will return an array of the first n multiples of x.

Assume both the given number and the number of times to count will be positive numbers greater than 0.
"""

def count_by(a, b):
    multiples_list = []
    multiple = 0

    for i in range(1, b + 1):
        multiple += a * 1
        multiples_list.append(multiple)

    return multiples_list



if __name__ == '__main__':
    print(count_by(2, 5))