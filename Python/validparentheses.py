

def isValid(s: str) -> bool:
    parens = {"(": ")", "{": "}", "[":"]"}
    previous = []
    
    for char in s:
        if char in parens.keys():
            previous.insert(0, char)
        else:
            if len(previous) == 0:
                return False
            if char == parens.get(previous[0]):
                previous.pop(0)
            else:
                return False
                
    return not(bool(len(previous)))

print(isValid("([])"))
            

