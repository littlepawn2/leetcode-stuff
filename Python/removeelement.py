

def removeDuplicates(nums) -> int:
    if len(nums) == 0:
        return 0
    
    for i in range(len(nums)-1, 0, -1):
        if(nums[i] == nums[i-1]):
            nums.pop(i)
        
    return len(nums)