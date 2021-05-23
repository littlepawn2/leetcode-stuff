

def combinationSumII(candidates, target):
    allCombos = []
    
    def trySum(candidates, target, previous, index):
        prevSum = sum(previous)
        candidates.sort()
        
        for i in range(index, len(candidates)):
            index+=1
            if prevSum + candidates[i] == target:
                toAppend = previous.copy()
                toAppend.append(candidates[i])
                toAppend.sort()
                
                if not toAppend in allCombos:
                    allCombos.append(toAppend)
            elif prevSum + candidates[i] < target:
                previous.append(candidates[i])
                
                trySum(candidates, target, previous, index)
                
                previous.pop()
                
    trySum(candidates, target, [], 0)
    return allCombos

print(combinationSumII([4,4,2,1,4,2,2,1,3], 6))