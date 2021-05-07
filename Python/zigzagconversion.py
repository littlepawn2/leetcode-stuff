

def convert(s: str, numRows: int) -> str:
    if numRows == 1:
        return s
    
    lines = [[] for i in range(numRows)]
    outString = ""
    
    linePointer = 0
    incrementer = 1
    
    for char in s:
        lines[linePointer].append(char)
        linePointer += incrementer
        
        if linePointer == numRows-1:
            incrementer = -1
        elif linePointer == 0:
            incrementer = 1
            
    
    for line in lines:
        for char in line:
            outString += char
            
    return outString
        
print(convert("ABC", 1))
        
    
