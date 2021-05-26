import java.util.*;

public class Permutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public List<List<Integer>> permute(int[] nums) {
    	List<List<Integer>> permutes = new ArrayList<>();
    	List<Integer> remaining = new ArrayList<>();
    	for (int num : nums) {
    		remaining.add(num);
    	}
    	track(permutes, remaining, new ArrayList<>());
        
    	return permutes;
    }
    
    private void track(List<List<Integer>> allPermutations, List<Integer> remaining, List<Integer> previous) {
		if(remaining.size() == 0) {
			allPermutations.add(previous);
			return;
		}
    	
    	for(int i=0; i<remaining.size(); i++) {
    		List<Integer> nextRemaining = new ArrayList<>(remaining);
    		List<Integer> nextPrevious = new ArrayList<>(previous);
    		
    		nextRemaining.remove(i);
    		nextPrevious.add(remaining.get(i));
    		
    		track(allPermutations, nextRemaining, nextPrevious);
    	}
		
	}

}
