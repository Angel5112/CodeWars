"""
Move the first letter of each word to the end of it,
then add "ay" to the end of the word. Leave punctuation marks untouched.
"""

def pig_it(text=str):

    words = text.split(" ")
    
    for i in range(0, len(words)):
        aux = words[i]
        charAux = aux[0]

        if charAux.isalpha(): 
            aux = aux[1::]
            aux += charAux + "ay"
            words[i] = aux

    return " ".join(words)


if __name__ == "__main__":
    print(pig_it('Hello world !'))