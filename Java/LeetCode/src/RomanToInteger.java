
public class RomanToInteger {

	public static void main(String[] args) {
		System.out.println(romanToInt("IV"));

	}
	
    public static int romanToInt(String s) {
        char last = ' ';
        int num = 0;
        
        for(int i=0; i<s.length(); i++) {
        	switch(s.charAt(i)) {
        	case 'M':
        		if(last == 'C') {
        			num += 800;
        		} else {
        			num += 1000;
        		}
        		break;
        	case 'D':
        		if(last == 'C') {
        			num += 300;
        		} else {
        			num += 500;
        		}
        		break;
        	case 'C':
        		if(last == 'X') {
        			num += 80;
        		} else {
        			num += 100;
        		}
        		break;
        	case 'L':
        		if(last == 'X') {
        			num += 30;
        		} else {
        			num += 50;
        		}
        		break;
        	case 'X':
        		if(last == 'I') {
        			num += 8;
        		} else {
        			num += 10;
        		}
        		break;
        	case 'V':
        		if(last == 'I') {
        			num += 3;
        		} else {
        			num += 5;
        		}
        		break;
        	case 'I':
        		num += 1;
        		break;
        	}
        	last = s.charAt(i);
        }
        
        return num;
    }

}
