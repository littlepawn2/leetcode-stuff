

def isPalindrome(x: int) -> bool:
    x = str(x)
    
    middle = len(x)//2
    if len(x) % 2 == 0:
        odd = 0
    else:
        odd = 1
        
    half1 = x[:middle]
    half2 = x[middle+odd:]
    
    half2 = "".join(list(reversed(list(half2))))
    
    print(half1, half2)
    
    if half1 == half2:
        return True
    else:
        return False


print(isPalindrome(1221))