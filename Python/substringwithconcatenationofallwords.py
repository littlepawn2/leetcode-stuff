

def findSubstring(s, words):
    wordLen = len(words[0])
    allWordsLen = len(words) * wordLen
    
    pastWords = words.copy()
    indexes = []
    for i in range(len(s)-allWordsLen+1):
        if(s[i:i+wordLen] in words):
            for j in range(0, allWordsLen, wordLen):
                current = s[j+i:j+i+wordLen]
                if(current in pastWords):
                    pastWords.remove(current)
                else:
                    break
            if len(pastWords) == 0:
                indexes.append(i)
            pastWords = words.copy()
    return indexes

print(findSubstring("wordgoodgoodgoodbestword", ["word","good","best","good"]))
