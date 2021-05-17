

def strStr(haystack: str, needle: str) -> int:
    needleLength = len(needle)
    hayLength = len(haystack)
    
    if needleLength == 0:
        return 0
    elif needleLength > hayLength:
        return -1
    else:
        for i in range(hayLength-needleLength+1):
            if haystack[i:i+needleLength] == needle:
                return i
        return -1
    
strStr("a", "a")
    