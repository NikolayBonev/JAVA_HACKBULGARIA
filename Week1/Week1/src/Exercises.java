import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.imageio.ImageIO;

public class Exercises {
	
//	Task 1
	boolean isOdd(int n){
		
		return !(n%2 ==0);
	}
	
//	Task 2
	boolean isPrime(int N){
		int counter = 0;
		
		for(int i = 1 ; i <= N ; i++){
			if(N%i == 0){
				counter++;
				
				if(counter > 2){
					return false;
				}
			}
		}
		
		return true;
	}
	
//	Task 3
	int min(int... array){
		Arrays.sort(array);
		
		return array[0];
	}
	
//	Task 4
	int kthMin(int k, int[] array){
		Arrays.sort(array);
		
		return array[k];
	}
	
//	Task 5
	int getAverage(int[] array){
		int average = 0 ;
		
		for(int i = 0 ; i < array.length ; i++){
			average+=array[i];
		}
		
		return average/array.length;
	}
	
//	Task 6
	long doubleFac(int n){
		long factorial = 1;
		long p = n;
		
		for(int j = 0; j < 2 ; j++){
			factorial = 1;
			
			p = factorial(p);
		}
		
		return factorial;
	}
	
	long factorial(long n){
		long factorial = 1;
		
		for(int i = 1 ; i <= n ; i++){
			factorial*= i;
		}
		
		return factorial;
	}
	
//	Task 7
	long kthFac(int k, int n){
		long factorial = 1;
		long p = n;
		
		for(int j = 0 ; j < k ; j++){
			factorial =1;
			
			p = factorial(p);
		}
		
		return factorial;
	}
	
//	Task 8
	long getSmallestMultiple(int upperBound){
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		
		for(int i = 2 ; i<= upperBound; i++){
			if(isPrime(i)){
				primeNumbers.add(i);
			}
		}
		
		int[] arrayNumbers = new int[upperBound-1];
		
		for(int i = 2; i <= upperBound ; i++){
			arrayNumbers[i-2] = i;
		}
		
		long multiple = 1;
		boolean flag = false, flagMultiple = false;
		
		for(int i = 0; i < primeNumbers.size() ;i++){
			for(int j = 0 ; j < upperBound -1; j++){
				if(arrayNumbers[j]%primeNumbers.get(i) == 0){
					flagMultiple = true;
					arrayNumbers[j] /= primeNumbers.get(i);
					
					if(!isOdd(arrayNumbers[j])){
						flag = true;
					}
				}
			}
			
			if(flagMultiple){
				multiple *= primeNumbers.get(i);	
			}
			
			if(flag){
				i--;
				flag = false;
			}
		}
		
		return multiple;
	}

//	Task 9
	long getLargestPalindrome(long N){
		boolean flag = true;

		for(long i = N -1 ; i > 0; i--){
			String number = i + "";
			flag = true;
			
			for(int j = 0; j < number.length() ; j++){
				if( number.charAt(j) != number.charAt(number.length() -1 -j)){
					flag = false;
					break;
				}
			}
			
			if(flag == true){
				return i;
			}
		}
		
		return -1;
	}
	
//	Task 10
	int[] histogram(short[][] image){
		int[] hits = new int[256];
		
		for(int i = 0 ; i < image.length ; i++){
			for(int j = 0 ; j < image[i].length; j++){
				hits[image[i][j]] += 1;
			}
		}
		
		return hits;
	}
	
//	Task 11
	long pow(int a, int b){
		long powNum = a;
		
		for(int i = 1 ; i < b ; i++){
			powNum *= a; 
		}
		
		return powNum;
	}
	
//	Task 12
	int getOddOccurrence(int... array){
		int counter = 0;
		
		for(int i = 0 ; i < array.length ; i++){
			for(int j = 0 ; j < array.length; j++){
				if(array[i] == array[j]){
					counter++;
				}
			}
			
			if(counter%2 !=0){
				return array[i];
			}
			
			counter = 0;
		}
		
		return counter;
	}
	
//	Task 13
	long maximalScalarSum(int[] a, int[]b){
		long result = 0;
		
		for(int i = 0 ; i < a.length; i++){
			getPermutation(a);
			
			for(int j = 0; j < b.length ; j++){
				getPermutation(b);
				
				long swapResult = 0;
				
				for(int k = 0 ; k < a.length ; k++){
					swapResult += a[k]*b[k];
				}
				
				if(swapResult > result){
					result = swapResult;
				}
				
				swapResult = 0;
			}
		}
		
		return result;
			
	}
	
	void getPermutation(int[] array){
		int iSwap = array[0];
				
		for(int j = 0, k = 1 ; j < array.length && k < array.length ; j++, k++){
			array[j] = array[k];
		}
		
		array[array.length -1] = iSwap;
	}
	
//	Task 14
	int maxSpan(int[] numbers){
		if(numbers.length == 0){
			return 0;
		}else if(numbers[0] == numbers[numbers.length-1]){
			return numbers.length;
		}
		
		int maxLen = 0;
		
		for(int i = 0; i < numbers.length ; i++){
			for(int j = numbers.length -1 ; j>=0 && j>=i; j--){
				if(numbers[i] == numbers[j] && (j - i + 1) > maxLen){
					maxLen = (j - i + 1);
				}
			}
		}
		
		return maxLen;
	}
	
//	Task 15
	boolean canBalance(int[] numbers){
		long leftSum = 0;
		long rightSum = 0;
		
		for(int i = 0 ; i < numbers.length ; i++){
			leftSum += numbers[i];
			
			if(i > 0){
				for(int j = 0; j < i; j++){
					leftSum += numbers[j];
				}
			}
			
			if(i < numbers.length -1){				
				for(int j = i+1; j < numbers.length; j++ ){
					rightSum += numbers[j];
				}
			}
			
			if(leftSum == rightSum){
				return true;
			}
			
			leftSum = 0;
			rightSum = 0;
		}
		
		return false;
	}
	
	int[][] rescale(int[][] original, int newWidth, int newHeight){
		
		double xRatio = newWidth/(double)original.length;
		double yRatio = newHeight/(double)original[0].length;
		
		int[][] rescaled = new int[newWidth][newHeight];
		
		for(int i = 0 ; i < rescaled.length; i++){
			for(int j = 0 ; j < rescaled[i].length ; j++){
				rescaled[i][j] = original[(int)(i/xRatio)][(int)(j/yRatio)];
			}
		}
		
		return rescaled;
	}
	
//	Task 17
	String reverseMe(String argument){
		StringBuilder arg = new StringBuilder(argument.length());
		
		for(int i = argument.length() - 1; i>= 0 ; i--){
			arg.append(argument.charAt(i));
		}
		
		return arg.toString();
	}
	
//	Task 18
	String reverseEveryChar(String arg){
		String[] words = arg.split("//s");
		
		StringBuilder result = new StringBuilder(arg.length());
		
		for(int i = 0 ; i < words.length ; i++){
			result.append(reverseMe(words[i]));
		}
		
		return result.toString();
	}
	
//	Task 19
	boolean isPalindrome(String argument){
		for(int j = 0; j < argument.length() ; j++){
			if( argument.charAt(j) != argument.charAt(argument.length() -1 -j)){
				return false;
			}
		}	
		
		return true;
	}
	
//	Task 20
	boolean isPalindrome(int argument){
		
		return isPalindrome(Integer.toString(argument));
	}
	
//	Task 21
	String copyEveryChar(String input, int k){
		StringBuilder result = new StringBuilder(input.length()*k);
		
		for(int i = 0 ; i < input.length() ; i++){
			for(int j = 0 ; j < k ; j++){
				result.append(input.charAt(i));
			}
		}
		
		return result.toString();
	}
	
//	Task 22
	int getPalindromeLength(String input){
		int index = input.indexOf('*');
		int conter = 0;
		
		for(int i = 0 ; i < index ; i++){
			int leftChar = index - 1 - i ;
			int rightChar = index + 2 + i;
			
			if(leftChar >= 0 && rightChar < input.length()){
				if(isPalindrome(input.substring(leftChar, rightChar))){
					conter++;
				}
			}
		}
		
		return conter;
	}
	
//	Task 23
	int countOcurrences(String needle, String haystack){
		int counter = 0;
		int index = -1;
		
		while(true){
			index = haystack.indexOf(needle.charAt(0), index + 1);
			
			if(haystack.length() - index >= needle.length()  && index > -1){
				if(haystack.substring(index, index+needle.length()).equals(needle)){
					counter++;
				}
			}else{
				break;
			}
		}
		
		return counter;
	}
	
//	Task 24
	String decodeUrl(String input){

		input = input.replaceAll("%20", " ");
		input = input.replaceAll("%3A", ":");
		input = input.replaceAll("%3D", "?");
		input = input.replaceAll("%2F", "/");
		
		return input;
	}
	
//	Task 25
	int sumOfNumbers(String input){	
		input = input.replaceAll("[^0-9]+", " ");
		
		Scanner in = new Scanner(input);
		
		int result = 0;
		
		while(in.hasNext()){
			if(in.hasNextInt()){
				result +=in.nextInt();
			}
		}
		
		in.close();
		return result;
	}
	
//	Task 26
	boolean anagram(String A, String B){	
		int[] charArrayA = foundChars(A);
		int[] charArrayB = foundChars(B);
		
		for(int i = 0 ; i < charArrayA.length ; i++){
			if(charArrayA[i] != charArrayB[i]){
				return false;
			}
		}
		
		return true;
	}
	
	int[] foundChars(String A){
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
	
//	Task 27
	boolean hasAnagramOf(String A,String B){
		
		A = A.replaceAll("[^a-zA-Z]", "");
		B = B.replaceAll("[^a-zA-Z]", "");
		
		int endIndex = A.length();
		for(int i = 0; i < B.length() && endIndex < B.length(); i++){
			if(anagram(A, B.substring(i, endIndex))){
				return true;
			}
			
			endIndex++;
		}
		
		return false;
	}
	
//	Task 28
	void convertToGreyscale(String imgPath){
		File input = new File(imgPath);
		
		try {
			if(input.createNewFile()){
				throw new IOException("Image not found!");
			}
			
			BufferedImage image = ImageIO.read(input);
			
			int width = image.getWidth();
	        int height = image.getHeight();
	        
	        for(int i=0; i<height; i++){
	            for(int j=0; j<width; j++){
	               Color c = new Color(image.getRGB(j, i));
	               
	               int red = (int)(c.getRed() * 0.299);
	               int green = (int)(c.getGreen() * 0.587);
	               int blue = (int)(c.getBlue() *0.114);
	               
	               Color newColor = new Color(red+green+blue,red+green+blue,red+green+blue);
	               
	               image.setRGB(j,i,newColor.getRGB());
	            }
	        }
	        
	        File ouptut = new File("../grayscale.jpg");
	        ImageIO.write(image, "jpg", ouptut);
	        
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}