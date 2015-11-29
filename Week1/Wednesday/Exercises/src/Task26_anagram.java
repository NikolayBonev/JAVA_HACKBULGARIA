
public class Task26_anagram {
	static boolean anagram(String A, String B){	
		int[] charArrayA = foundChars(A);
		int[] charArrayB = foundChars(B);
		
		for(int i = 0 ; i < charArrayA.length ; i++){
			if(charArrayA[i] != charArrayB[i]){
				return false;
			}
		}
		
		return true;
	}
	
	static int[] foundChars(String A){
		int[] alphabet = new int[26];
		
		for(int i = 0 ; i < A.length() ; i++){
			
			switch (A.charAt(i)) {
			case 'A':
			case 'a':
				alphabet[0] += 1; 
				break;
			case 'B':
			case 'b':
				alphabet[1] += 1; 
				break;
			case 'C':
			case 'c':
				alphabet[2] += 1; 
				break;
			case 'D':
			case 'd':
				alphabet[3] += 1; 
				break;
			case 'E':
			case 'e':
				alphabet[4] += 1; 
				break;
			case 'F':
			case 'f':
				alphabet[5] += 1; 
				break;
			case 'G':
			case 'g':
				alphabet[6] += 1; 
				break;
			case 'H':
			case 'h':
				alphabet[7] += 1; 
				break;
			case 'I':
			case 'i':
				alphabet[8] += 1; 
				break;
			case 'J':
			case 'j':
				alphabet[9] += 1; 
				break;
			case 'K':
			case 'k':
				alphabet[10] += 1; 
				break;
			case 'L':
			case 'l':
				alphabet[11] += 1; 
				break;
			case 'M':
			case 'm':
				alphabet[12] += 1; 
				break;
			case 'N':
			case 'n':
				alphabet[13] += 1; 
				break;
			case 'O':
			case 'o':
				alphabet[14] += 1; 
				break;
			case 'P':
			case 'p':
				alphabet[15] += 1; 
				break;
			case 'Q':
			case 'q':
				alphabet[16] += 1; 
				break;
			case 'R':
			case 'r':
				alphabet[17] += 1; 
				break;
			case 'S':
			case 's':
				alphabet[18] += 1; 
				break;
			case 'T':
			case 't':
				alphabet[19] += 1; 
				break;
			case 'U':
			case 'u':
				alphabet[20] += 1; 
				break;
			case 'V':
			case 'v':
				alphabet[21] += 1; 
				break;
			case 'W':
			case 'w':
				alphabet[22] += 1; 
				break;
			case 'X':
			case 'x':
				alphabet[23] += 1; 
				break;
			case 'Y':
			case 'y':
				alphabet[24] += 1; 
				break;
			case 'Z':
			case 'z':
				alphabet[25] += 1; 
				break;
			}
			
		}
		
		return alphabet;
	}
}
