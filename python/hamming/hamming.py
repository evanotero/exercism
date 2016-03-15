# Calculates the Hamming difference between two DNA strands

def distance(s1, s2):
    dnalen = len(s1)
    count = 0
    for x in range(dnalen):
        if s1[x] != s2 [x]:
            count += 1
    return count
