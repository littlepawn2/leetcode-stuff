
public class LongestPalindromeicSubstring {

	public static void main(String[] args) {

		System.out.println(longestPalindrome("bb"));

	}
	
	public static String longestPalindrome(String s) {
		int sLength = s.length();
		int count = 0;
		String palinString = "";
		
		for (int i=0; i<sLength; i++) {
			int currentCount = 1;
			String palinString1 = "";
			String palinString2 = "";
			
			for(int j=i, k=i; j<sLength && k>-1; j++, k--) {
				if(i == j)
					continue;
				if(s.charAt(j) == s.charAt(k)) {
					currentCount += 2;
				} else {
					break;
				}
			}
			
			if(currentCount > count) {
				count = currentCount;
				palinString1 = s.substring(i-currentCount/2, i+currentCount/2+1);
			}
			
			currentCount = 0;
			
			for(int j=i+1, k=i; j<sLength && k>-1; j++, k--) {
				if(s.charAt(j) == s.charAt(k)) {
					currentCount += 2;
				} else {
					break;
				}
			}
			
			if(currentCount > count) {
				count = currentCount;
				System.out.println(currentCount);
				palinString2 = s.substring(i-currentCount/2+1, i+currentCount/2+1);
			}
			
			String palinString3 = palinString1.length() > palinString2.length() ? palinString1 : palinString2;
			palinString = palinString3.length() > palinString.length() ? palinString3 : palinString;
		}
		
		return palinString;
        
    }

}
