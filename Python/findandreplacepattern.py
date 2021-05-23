

def findAndReplacePattern(words, pattern):
    successful = []
    
    for word in words:
        letterDict = dict()
        
        for i in range(len(pattern)):
            if pattern[i] in letterDict.keys():
                if letterDict.get(pattern[i]) != word[i]:
                    break
            else:
                if not word[i] in letterDict.values():
                    letterDict[pattern[i]] = word[i]
                else:
                    break
        else:
            successful.append(word)
            
    return successful
                