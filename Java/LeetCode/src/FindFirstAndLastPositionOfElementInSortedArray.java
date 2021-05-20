
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int pA = 0;
        int pB = nums.length-1;
        
        while(pA <= pB) {
        	if(nums[pA] == target && nums[pB] == target) {
        		return new int[] {pA, pB};
        	} else if(nums[pA] == target) {
        		pB -= 1;
        	} else if(nums[pB] == target) {
        		pA += 1;
        	} else {
        		pA += 1;
        		pB -= 1;
        	}
        }
        
        return new int[] {-1, -1};
    }
}
