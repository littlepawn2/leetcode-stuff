

def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
    combinedNums = []
    otherNums = []
    
    nums1len = len(nums1)
    nums2len = len(nums2)
    
    if(nums1len > nums2len):
        combinedNums = nums1
        otherNums = nums2
    else:
        combinedNums = nums2
        otherNums = nums1
    
    if(nums1len == 0):
        combinedNums = nums2
        otherNums = nums1
    if(nums2len == 0):
        combinedNums = nums1
        otherNums = nums2
        
    combinedNumslen = len(combinedNums)
    
    for numIn in otherNums:   
        for i in range(combinedNumslen):
            if(numIn <= combinedNums[i]):
                combinedNums.insert(i, numIn)
                combinedNumslen += 1
                break
            elif(i == combinedNumslen-1):
                combinedNums.append(numIn)
                combinedNumslen += 1
    
    if((combinedNumslen) % 2 == 0):
        return (combinedNums[combinedNumslen//2] + combinedNums[combinedNumslen//2 - 1] )/2
    else:
        return combinedNums[combinedNumslen//2]

def findMedianSortedArrays2(self, nums1: List[int], nums2: List[int]) -> float:
    combinedNums = nums1 + nums2
    combinedNums = sorted(combinedNums)
    combinedNumslen = len(combinedNums)
    
    if((combinedNumslen) % 2 == 0):
        return (combinedNums[combinedNumslen//2] + combinedNums[combinedNumslen//2 - 1] )/2
    else:
        return combinedNums[combinedNumslen//2]
    
