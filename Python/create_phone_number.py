"""
Write a function that accepts an array of 10 integers (between 0 and 9), that returns
a string of those numbers in the form of a phone number.

Example
create_phone_number([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]) # => returns "(123) 456-7890"
The returned format must be correct in order to complete this challenge.

Don't forget the space after the closing parentheses!
"""


def create_phone_number(n: list) -> str:
    if len(n) != 10:
        return ""
    else:
        parentheses = "("
        first_digits = ""
        last_digits = ""

        for i in range(0, 10):
            if i >= 0 and i < 3:
                parentheses += str(n[i])
            elif i >= 3 and i < 6:
                first_digits += str(n[i])
            else:
                last_digits += str(n[i])

        return f"{parentheses}) {first_digits}-{last_digits}"


if __name__ == "__main__":
    print(create_phone_number([1, 2, 3, 4, 5, 6, 7, 8, 9, 0]))
