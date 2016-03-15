#
# Skeleton file for the Python "Hello World" exercise.
#

def hello(name=''):
    if name.isspace() or not len(name):
        output = "Hello, World!"
    else:
        output = "Hello, " + name + "!"
    return output
