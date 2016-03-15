# A program that will take a year and report if it is a leap year.

def is_leap_year(year):
    leapyear = False
    if year % 4 == 0:
        if year % 100 == 0:
            if year % 400 == 0:
                leapyear = True
        else:
            leapyear = True
    return leapyear