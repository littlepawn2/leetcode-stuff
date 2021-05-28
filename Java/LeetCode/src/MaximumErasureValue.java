import java.util.*;

public class MaximumErasureValue {
	
	public static void main(String[] args) {
		System.out.println(maximumUniqueSubarray(new int[] {1,2, 3, 4, 5, 6, 7, 8, 9, 10}));
	}
	
    public static int maximumUniqueSubarray(int[] nums) {
        int maxScore = 0;
        
        for(int i=0; i<nums.length; i++) {
        	List<Integer> currentNums = new LinkedList<>();
        	int sum = 0;
        	for(int j=i; j<nums.length; j++) {
        		if(currentNums.contains(nums[j])) {
        			if(maxScore<sum) {
        				maxScore = sum;
        			}
        			i += currentNums.indexOf(nums[j]);
        			currentNums.clear();
        			break;
        		} else {
        			sum += nums[j];
        			currentNums.add(nums[j]);
        			
        			if(j == nums.length-1) {
        				if(maxScore<sum)
        					maxScore = sum;
        				return maxScore;
        			}
        		}
        	}
        }
        
        return maxScore;
    }

}
