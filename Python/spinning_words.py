"""
Write a function that takes in a string of one or more words, and returns the same string,
but with all five or more letter words reversed (Just like the name of this Kata).
Strings passed in will consist of only letters and spaces.
Spaces will be included only when more than one word is present.
"""


def reverse_word(word: str) -> str:

    new_word = ""

    for i in range(len(word)):
        new_word += word[len(word) - i - 1]

    return new_word


def spin_words(sentence: str) -> str:

    separated_words = sentence.split(" ")

    for i in range(len(separated_words)):
        if len(separated_words[i]) >= 5:
            separated_words[i] = reverse_word(separated_words[i])

    return " ".join(separated_words)


if __name__ == "__main__":
    print(spin_words("Hey fellow warriors"))
