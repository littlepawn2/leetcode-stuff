
def letterCombinations(digits):
    letterMap = {"2":"abc", "3":"def", "4":"ghi", "5":"jkl", "6":"mno", "7":"pqrs", "8":"tuv", "9":"wxyz"}
    combos = [""]
    prevCombos = []
    
    if digits == "":
        return []
    
    
    for number in digits:
        prevCombos = combos.copy()
        combos.clear()
        for combo in prevCombos:
            for letter in letterMap.get(number):
                combos.append(combo+letter)
                
    return combos

print(letterCombinations(""))
            