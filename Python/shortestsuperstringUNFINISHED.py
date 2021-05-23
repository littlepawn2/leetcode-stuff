


def shortestSuperstring(words):
    if len(words) == 0:
        return ""
    wordList = []
    
    for word in words:
        maxOverlap = 0
        maxOverlapIndex = 0
        
        for i in range(-1, len(wordList)):
            currentOverlap = 0
            lastOverlap = 0
            
            if i != len(wordList)-1:
                
                while currentOverlap != len(wordList[i]) and currentOverlap != len(word):
                    if wordList[i+1][currentOverlap] == word[-currentOverlap-1]:
                        print(word[-currentOverlap])
                        currentOverlap += 1
                        if currentOverlap > maxOverlap:
                            maxOverlap = currentOverlap
                            maxOverlapIndex = i+1
                        continue
                    break
                lastOverlap = currentOverlap
                currentOverlap = 0
            
            if i != -1:
                
                while currentOverlap != len(wordList[i]) and currentOverlap != len(word):
                    if wordList[i][currentOverlap] == word[-currentOverlap-1]:
                        currentOverlap += 1
                        if currentOverlap+lastOverlap > maxOverlap:
                            maxOverlap = currentOverlap+lastOverlap
                            maxOverlapIndex = i
                        continue
                    break
                
        wordList.insert(maxOverlapIndex, word)
    return(wordList)
    
print(shortestSuperstring(["catg","ctaagt","gcta","ttca","atgcatc"]))                
