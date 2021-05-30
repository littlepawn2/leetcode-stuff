

def maximumGap(nums):
    if len(nums) < 2:
        return 0
    nums = sorted(nums)
    maxNum = 0
    for i in range(len(nums)-1):
        currentNum = abs(nums[i] - nums[i+1])
        if(currentNum>maxNum):
            maxNum = currentNum
    
    return maxNum
        