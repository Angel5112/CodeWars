"""
The main idea is to count all the occurring characters in a string.
If you have a string like aba, then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.
"""

def counts(s):

    ocurring_chars = dict()

    for i in range(0, len(s)):
        if s[i] not in ocurring_chars:
            ocurring_chars[s[i]] = 1
        else:
            ocurring_chars[s[i]] += 1

    return ocurring_chars


if __name__ == "__main__":
    print(counts("aba"))