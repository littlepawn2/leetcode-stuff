import java.util.*;

public class ThreeSumClosest {

	public static void main(String[] args) {
		System.out.println(threeSumClosest(new int[] {-20, -19, -19, -18}, -59));

	}
	
	public static int threeSumClosest(int[] nums, int target) {
        int closest = 0;
        int distance = Integer.MAX_VALUE;
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++) {
        	if(i > 0 && nums[i] == nums[i-1])
        		continue;
        	int j = i+1;
        	int k = nums.length-1;
        	
        	while(j<k) {
        		int sum = nums[i] + nums[j] + nums[k];
            	int currentDistance = sum - target;
            	if(currentDistance == 0) {
            		return sum;
            	}
            	
	        	if(Math.abs(currentDistance) < distance) {
	        		closest = sum;
	        		distance = Math.abs(currentDistance);
	        	}
	        	
	        	if(currentDistance > 0) {
	        		k--;
	        	} else {
	        		j++;
	        	}
        	}
        }
        
        return closest;
    }

}
