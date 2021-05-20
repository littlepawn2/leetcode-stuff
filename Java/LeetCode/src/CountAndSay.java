
public class CountAndSay {

	public static void main(String[] args) {
		System.out.println(countAndSay(4));

	}
	
    public static String countAndSay(int n) {
    	String s = "1";
    	for(int i=0; i<n-1; i++) {
    		s = say(s);
    	}
    	return s;
        
    }
    
    private static String say(String s) {
		StringBuilder out = new StringBuilder();
		
		for(int i=0; i<s.length(); i++) {
			int count = 1;
			while(i+1 != s.length() && s.charAt(i) == s.charAt(i+1)) {
				count++;
				i++;
			}
			out.append(count);
			out.append(s.charAt(i));
		}
		
		return out.toString();
	}

}
