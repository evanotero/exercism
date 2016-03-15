# Determines if a sentence is a pangram.

def is_pangram(s):
    alphabet = set()
    letters = set()
    for i in 'abcdefghijklmnopqrstuvwxyz':
        alphabet.add(i)
    for letter in s:
        if letter.isalpha():
            letters.add(letter.lower())
    return alphabet == letters
