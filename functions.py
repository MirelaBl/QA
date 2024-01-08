def add(x,y):
    return x+y

def down(x,y):
    return x - y

def division(x,y):
    if y == 0:
        raise ValueError("/ 0 is not recommended")
    return x / y

def multiplication(x,y):
    return x * y