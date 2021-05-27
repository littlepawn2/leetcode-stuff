import java.util.*;
public class MaximumProductOfWordLengths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public int maxProduct(String[] words) {
        int maxSoFar = 0;
        for(var word1 : words) {
        	OUTER_LOOP: for(var word2 : words) {
        		char previous = ' ';
        		for(char char1 : word1.toCharArray()) {
        			if(previous == char1) {
        				continue;
        			}
        			for(char char2 : word2.toCharArray()) {
        				if(char1 == char2) {
        					continue OUTER_LOOP;
        				}
        			}
        			previous = char1;
        		}
        		
        		int mult = word1.length() * word2.length();
        		if(mult > maxSoFar) {
        			maxSoFar = mult;
        		}
        		
        	}
        }
        return maxSoFar;
    }

}
