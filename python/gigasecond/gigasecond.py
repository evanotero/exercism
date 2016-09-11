# Calculate the date that someone turned or will
# celebrate their 1 Gs anniversary.
from datetime import datetime

def add_gigasecond(date):
    seconds = 10**9
    addseconds = seconds % 60 
    seconds /= 60
    addminutes = seconds % 60
    seconds /= 60
    addhours = seconds % 24
    seconds /= 24
    adddays = seconds % 30
    seconds /= 30
    addmonths = seconds % 12
    seconds /= 12
    addyears = seconds
    print addyears