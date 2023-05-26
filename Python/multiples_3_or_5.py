"""
If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
The sum of these multiples is 23.

Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
Additionally, if the number is negative, return 0 (for languages that do have them).

Note: If the number is a multiple of both 3 and 5, only count it once.
"""


def multiples_search(num):

    multiples = []

    for i in range(1, num):
        if i % 3 == 0 or i % 5 == 0:
            multiples.append(i)

    return multiples


def multiples_sum(num):

    if num < 0:
        return 0
    else:
        multiples = multiples_search(num)
        solution_sum = 0

        for i in range(0, len(multiples)):
            solution_sum += multiples[i]

        return solution_sum


if __name__ == "__main__":
    print(multiples_sum(10))
