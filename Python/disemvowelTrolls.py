"""
Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
"""

def disemvowel(s):

    vowels = ["a", "A", "e", "E", "I", "i", "o", "O", "u", "U"]
    disemvowel_string = ""

    disemvowel_string = list(filter(lambda x: x not in vowels, s))

    return "".join(disemvowel_string)



if __name__ == '__main__':
    print(disemvowel("Hola mundo!"))