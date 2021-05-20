

def combinationSum(candidates, target):
    allCombos = []
    
    def trySum(candidates, target, previous):
        prevSum = sum(previous)
        
        for candidate in candidates:
            if prevSum + candidate == target:
                toAppend = previous.copy()
                toAppend.append(candidate)
                toAppend.sort()
                
                if not toAppend in allCombos:
                    allCombos.append(toAppend)
            elif prevSum + candidate < target:
                previous.append(candidate)
                trySum(candidates, target, previous)
                previous.pop()
                
    trySum(candidates, target, [])
    return allCombos

print(combinationSum([21,46,35,20,44,31,29,23,45,37,33,34,39,42,24,40,41,26,22,38,36,27,25,49,48,43], 71))