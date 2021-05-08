
public class RegularExpressionMatching {

	public static void main(String[] args) {
		System.out.println(isMatch("aab", "aab."));

	}
	
	public static boolean isMatch(String s, String p) {
		int sPointer = 0;
		int pPointer = 0;
		int sLimit = s.length();
		int pLimit = p.length();
		
		while(true) {
			if(sPointer >= sLimit && pPointer >= pLimit) {
				break;
			} else if(sPointer >= sLimit) {
				sPointer = sLimit-1;
				return false;
			} else if(pPointer >= pLimit) {
				pPointer = pLimit-1;
				return false;
			}
			char sChar = s.charAt(sPointer);
			char pChar = p.charAt(pPointer);
			
			if(pChar == '.') {
				sPointer += 1;
				pPointer += 1;
			} else if(pChar == '*') {
				char previous = p.charAt(pPointer - 1);
				if(previous != '.') {
					if(s.lastIndexOf(previous) >= sPointer) {
						while(s.charAt(sPointer) == previous && sPointer < sLimit) {
							sPointer += 1;
						}
					}
					pPointer += 1;
				} else {
					if(pPointer == pLimit - 1) {
						return true;
					} else {
						char after = p.charAt(pPointer + 1);
						for(int i=sPointer; i<sLimit; i++) {
							if(s.charAt(i) == after) {
								if( isMatch(s.substring(i, sLimit), p.substring(pPointer+1, pLimit))) {
									return true;
								}
							}
						}
						return false;
					}
				}
			} else {
				if(sChar == pChar) {
					sPointer += 1;
					pPointer += 1;
				} else {
					return false;
				}
			}
		}
		
		return true;
		
        
    }

}
