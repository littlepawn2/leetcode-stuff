
def longestCommonPrefix(strs) -> str:
    prefix = ""
    pString = 0
    out = False
    
    if strs[0] == "":
        return ""
    
    while True:
        currentChar = strs[0][pString]
        for string in strs:
            if pString == len(string):
                out = True
                break
            elif string[pString] != currentChar:
                out = True
                break
        if out:
            break
        
        prefix += currentChar
        pString += 1
        
    return prefix

print(longestCommonPrefix(["flower","flow","flight"]))