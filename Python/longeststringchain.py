

def longestStrChain(words):
    words.sort(key=len, reverse=True)
    childPaths = []
    visited = []
    
    def findChildren(word, previous):
        childPaths.append(previous.copy())

        for i in range(len(word)):
            currentWord = word[0:i]+word[i+1:]
            if currentWord in words:
                if currentWord in visited:
                    continue
                else:
                    previous.append(currentWord)
                    visited.append(currentWord)
                    findChildren(currentWord, previous)
                    previous.pop()
        return
    
    for word in words:
        if word in visited:
            continue
        else:
            findChildren(word, [word])
            
    if len(childPaths) == 0:
        return 0
    return max([len(childPaths[i]) for i in range(len(childPaths))])
    


words = ["a","b","ba","bca","bda","bdca"]
print(longestStrChain(words))