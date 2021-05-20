

def searchInsert(nums, target) -> int:
    return binarySearch(nums, target)


def binarySearch(passedList, searchItem):
    #takes sorted list and an item
    #returns position of item in list
    top = 0
    bottom = len(passedList)-1
    middle = (bottom + top) // 2
    
    if len(passedList) == 0:
        return 0
    
    while top <= bottom:
        middle = (bottom + top) // 2
        if passedList[middle] < searchItem:
            top = middle + 1
        elif passedList[middle] > searchItem: 
            bottom = middle - 1
        else:
            return middle
    else:
        if searchItem < passedList[middle]:
            return middle
        else:
            return middle + 1
        
print(searchInsert([1], 0))