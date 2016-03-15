# Given a DNA strand, return its RNA complement

def to_rna(dna):
    rna = ""
    for i in dna:
        if i == "G":
            rna += "C"
        elif i == "C":
            rna += "G"
        elif i == "T":
            rna += "A"
        elif i == "A":
            rna += "U"
        else:
            rna += ""
    return rna
