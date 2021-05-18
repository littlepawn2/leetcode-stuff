

def search(nums, target):
    pivot = 0
    for i in range(len(nums)-1):
        if nums[i] > nums[i+1]:
            pivot = i+1
            break
    
    search1 = binarySearch(nums[pivot:], target)
    if search1 != -1:
        search1 += pivot
        return search1
        
    search2 = binarySearch(nums[:pivot], target)
    return search2
    
    
    
def binarySearch(passedList, searchItem):
    #takes sorted list and an item
    #returns position of item in list
    top = 0
    bottom = len(passedList)-1
    middle = (bottom + top) // 2
    
    if len(passedList) == 0:
        return -1
    
    while top <= bottom:
        if passedList[middle] < searchItem:
            top = middle + 1
        elif passedList[middle] > searchItem: 
            bottom = middle - 1
        else:
            return middle
        middle = (bottom + top) // 2
    else:
        return -1
    
print(search([4,5,6,7,0,1,2], 0))
