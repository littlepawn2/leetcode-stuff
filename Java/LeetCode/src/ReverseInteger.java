
public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println(reverse(-123));

	}
	
	public static int reverse(int x) {
		StringBuilder reverseString = new StringBuilder(Integer.toString(x)).reverse();
		int reverseInt;
		
		if(reverseString.charAt(reverseString.length()-1) == '-') {
			reverseString.deleteCharAt(reverseString.length()-1);
			reverseString.insert(0, '-');
		}
		
		try {
			reverseInt = Integer.parseInt(reverseString.toString());
		} catch (NumberFormatException e) {
			reverseInt = 0;
		}
		
		return reverseInt;
	}
	
	/*
	public static int reverse(int x) {
        String number = String.valueOf(x);
        StringBuilder reverseNum = new StringBuilder();
        
        for(int i=number.length()-1; i>-1; i--) {
        	if(reverseNum.length() < 9) {
        		reverseNum.append(number.charAt(i));
        	} else if (reverseNum.length() == 9){
        		
        		if(Character.getNumericValue(number.charAt(i)) == 1) {
        			reverseNum.append(number.charAt(i));
        		} else if (Character.getNumericValue(number.charAt(i)) == 2) {
        			if(Integer.parseInt(reverseNum.toString()) > 147483648) {
            			reverseNum = new StringBuilder("0");
            			break;
            		} else {
            			reverseNum.append(number.charAt(i));
            		}
        		} else {
        			reverseNum = new StringBuilder("0");
        			break;
        		}
        	}
        }
        System.out.println(reverseNum);
        
        return Integer.parseInt(reverseNum.toString());
        
    }
    */

}
