import java.util.*;

public class TwoSum {
	public static void main(String[] args) {
		
		System.out.println( Arrays.toString(twoSum(new int[] {3, 2, 4}, 6)) );
	}
	
	public static int[] twoSum(int[] nums, int target) {
        
        for(int i=0;i<nums.length; i++){
            for(int j=0;j<nums.length; j++){
                if(nums[i] + nums[j] == target && i != j){
                    return new int[]{i, j};
                }
            }
        }
        
        return new int[]{0, 0};
	}

}
