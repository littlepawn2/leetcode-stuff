

def jump(nums):
    dest = len(nums) - 1
    left = dest
    jump = 0
    while dest > 0:
    	for i in reversed(range(dest)):
    		if nums[i] >= dest - i:
    			left = i
    	jump += 1
    	dest = left
    return jump
    
print(jump([2,3,1,1,4]))