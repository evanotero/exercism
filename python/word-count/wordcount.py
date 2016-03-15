# A program that counts the occurrences of each word in a phrase

import re

def word_count(s):
    output = {}
    for word in re.findall(ur'[^\W_]+',s.lower().decode('utf-8'),flags=re.U):
        if word:
            output[word] = output.get(word, 0) + 1
    return output
