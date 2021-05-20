

def minMoves2(nums):
    count = 0
    nums.sort()
    target = nums[len(nums)//2]
    for i in range(len(nums)):
        if nums[i] != target:
            count += abs(target - nums[i])
    return count