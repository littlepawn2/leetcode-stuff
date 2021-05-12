

def threeSum(nums):
    triplets = []
    nums.sort()
    
    for i in range(len(nums)-2):
        if(i != 0):
            if(nums[i] == nums[i-1]):
                continue
        j = i+1
        k = len(nums)-1
        target = -nums[i]
        
        while(j<k):
            if(nums[j] + nums[k] == target):
                triplets.append([nums[i], nums[j], nums[k]])
                while(j<k and nums[j] == nums[j+1]):
                    j+=1
                while(j<k and nums[k] == nums[k-1]):
                    k-=1
                j+=1
                k-=1
            elif(nums[j] + nums[k] > target):
                k -= 1
            else:
                j+= 1
    
    return triplets

print(threeSum([-1,0,1,2,-1,-4]))
    