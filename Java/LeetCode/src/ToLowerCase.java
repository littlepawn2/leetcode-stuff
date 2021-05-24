
public class ToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public String toLowerCase(String s) {
        int[] intchars = s.chars().toArray();
        char[] lowers = new char[s.length()];
        
        for(int i=0; i<s.length(); i++) {
        	if(intchars[i] > 64 && intchars[i] < 91) {
	        	lowers[i] = (char) (intchars[i]+32);
        	} else {
        		lowers[i] = (char) intchars[i];
        	}
        }
        
        return String.valueOf(lowers);
    }

}
