

def longestValidParentheses(s: str):
    s = list(s)
    
    while True:
        
        i = 0
        breaker = True
        while i<len(s):
            if s[i] == "(":
                for j in range(i+1, len(s)):
                    if s[j] == "(":
                        break
                    elif s[j] == ")":
                        s.pop(j)
                        s.pop(i)
                        s.insert(i, "-")
                        breaker = False
                        break
            i+=1
            
        if breaker:
            break
    
    counter = 0
    maxCounter = 0
    for i in range(len(s)):
        if s[i] == "-":
            counter += 1
        else:
            if counter > maxCounter:
                maxCounter = counter
            counter = 0
    
    if counter > maxCounter:
                maxCounter = counter
    
    return maxCounter *2


print(longestValidParentheses("(()"))                      
                        