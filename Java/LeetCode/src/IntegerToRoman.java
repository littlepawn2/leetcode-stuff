
public class IntegerToRoman {

	public static void main(String[] args) {
		System.out.println(intToRoman(1994));

	}
	
	public static String intToRoman(int num) {
        //num < 4000
		String numString = Integer.toString(num);
		StringBuilder romanString = new StringBuilder();
		char[] romanChars = new char[] {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
		int charSet = 4;
		
		for(int i=numString.length()-1; i>-1; i--) {
			char currentNum = numString.charAt(i);
			System.out.println(currentNum);
			
			switch(currentNum){
			case '0':
				break;
			case '9':
				romanString.append(romanChars[charSet]);
				romanString.append(romanChars[charSet+2]);
				break;
			case '8':
				romanString.append(romanChars[charSet+2]);
				romanString.append(romanChars[charSet+2]);
				romanString.append(romanChars[charSet+2]);
				romanString.append(romanChars[charSet+1]);
				break;
			case '7':
				romanString.append(romanChars[charSet+2]);
				romanString.append(romanChars[charSet+2]);
				romanString.append(romanChars[charSet+1]);
				break;
			case '6':
				romanString.append(romanChars[charSet+2]);
				romanString.append(romanChars[charSet+1]);
				break;
			case '5':
				romanString.append(romanChars[charSet+1]);
				break;
			case '4':
				romanString.append(romanChars[charSet+1]);
				romanString.append(romanChars[charSet+2]);
				break;
			case '3':
				romanString.append(romanChars[charSet+2]);
			case '2':
				romanString.append(romanChars[charSet+2]);
			case '1':
				romanString.append(romanChars[charSet+2]);
				break;
			}
			
			charSet -= 2;
		}
		
		return romanString.reverse().toString();
		
		
    }

}
