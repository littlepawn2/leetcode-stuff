import java.util.*;

public class LongestSubstringWOutRepeats {

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("ddvdf"));

	}
	
	public static int lengthOfLongestSubstring(String s) {
		//poorly optimized, maybe will come back to it
		int len = s.length();
		int count = 0;
		int currentCount = 0;
		
		ArrayList<Character> existing = new ArrayList<>();
		for(int i=0; i<len; i++) {
			if(existing.contains(s.charAt(i))) {
				count = currentCount > count ? currentCount : count;
				i -= currentCount - 1;
				currentCount = 0;			
				existing.clear();
			}
			
			existing.add(s.charAt(i));
			currentCount += 1;
		}
		count = currentCount > count ? currentCount : count;
		
		return count;
        
    }

}
