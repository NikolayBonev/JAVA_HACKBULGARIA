import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task33_100SMS {
		
	static String numbersToMessage(int[] pressedSequence){
		StringBuilder message = new StringBuilder();
		boolean capital = false;
		
		for(int i = 0 ; i < pressedSequence.length ; i++){	
			switch (pressedSequence[i]) {
			case 0:
				message.append(" ");
				break;
			case 1:
				capital = true;
				break;
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:{
				int counter = 1;
				
				for(int j = i+1; j < pressedSequence.length ; j++){
					if(pressedSequence[i] == pressedSequence[j]){
						counter++;
					}else if(pressedSequence[j] == -1 || pressedSequence[i] != pressedSequence[j]){
						break;
					}
				}
				
				char ch = decodeNumbers(pressedSequence[i], counter);
				
				if(capital){
					ch = Character.toUpperCase(ch);
					capital = false;
				}
				
				i += counter -1;
				message.append(ch);
			}
			}
		}
		
		return message.toString();
	}
	
	static int[] messageToNumbers(String messsage){
		
		ArrayList<Integer> encodedMessage = new ArrayList<Integer>();
		
		for(int i = 0 ; i < messsage.length() ; i++){
			
			if(messsage.charAt(i) == ' '){
				encodedMessage.add(0);
				continue;
			}else if(Character.isUpperCase(messsage.charAt(i))){
				encodedMessage.add(1);
			}
			
			encodedMessage.addAll(encodeNumbers(messsage.charAt(i)));
			
			if(i < messsage.length() -1){
				encodedMessage.add(-1);
			}
		}
		
		return encodedMessage.stream().mapToInt(i -> i).toArray();
	}
	
	private static char decodeNumbers(int number, int timesPressed){
		
		String lettersInButton = "";
		
		switch (number) {
		case 2:
			lettersInButton = "abc";
			break;
		case 3:
			lettersInButton = "def";
			break;
		case 4:
			lettersInButton = "ghi";
			break;
		case 5:
			lettersInButton = "jkl";
			break;
		case 6:
			lettersInButton = "mno";
			break;
		case 7:
			lettersInButton = "pqrs";
			break;
		case 8:
			lettersInButton = "tuv";
			break;
		case 9:
			lettersInButton = "wxyz";
			break;
		}
		
		timesPressed = (timesPressed-1)%lettersInButton.length();
				
		return lettersInButton.charAt(timesPressed);
	}

	private static ArrayList<Integer> encodeNumbers(char ch){
		
		HashMap<Character, ArrayList<Integer>> encoderTable = new HashMap<>();
		
		encoderTable.put('a', new ArrayList<Integer>(Arrays.asList(2)));
		encoderTable.put('b', new ArrayList<Integer>(Arrays.asList(2,2)));
		encoderTable.put('c', new ArrayList<Integer>(Arrays.asList(2,2,2)));
		encoderTable.put('d', new ArrayList<Integer>(Arrays.asList(3)));
		encoderTable.put('e', new ArrayList<Integer>(Arrays.asList(3,3)));
		encoderTable.put('f', new ArrayList<Integer>(Arrays.asList(3,3,3)));
		encoderTable.put('g', new ArrayList<Integer>(Arrays.asList(4)));
		encoderTable.put('h', new ArrayList<Integer>(Arrays.asList(4,4)));
		encoderTable.put('i', new ArrayList<Integer>(Arrays.asList(4,4,4)));
		encoderTable.put('j', new ArrayList<Integer>(Arrays.asList(5)));
		encoderTable.put('k', new ArrayList<Integer>(Arrays.asList(5,5)));
		encoderTable.put('l', new ArrayList<Integer>(Arrays.asList(5,5,5)));
		encoderTable.put('m', new ArrayList<Integer>(Arrays.asList(6)));
		encoderTable.put('n', new ArrayList<Integer>(Arrays.asList(6,6)));
		encoderTable.put('o', new ArrayList<Integer>(Arrays.asList(6,6,6)));
		encoderTable.put('p', new ArrayList<Integer>(Arrays.asList(7)));
		encoderTable.put('q', new ArrayList<Integer>(Arrays.asList(7,7)));
		encoderTable.put('r', new ArrayList<Integer>(Arrays.asList(7,7,7)));
		encoderTable.put('s', new ArrayList<Integer>(Arrays.asList(7,7,7,7)));
		encoderTable.put('t', new ArrayList<Integer>(Arrays.asList(8)));
		encoderTable.put('u', new ArrayList<Integer>(Arrays.asList(8,8)));
		encoderTable.put('v', new ArrayList<Integer>(Arrays.asList(8,8,8)));
		encoderTable.put('w', new ArrayList<Integer>(Arrays.asList(9)));
		encoderTable.put('x', new ArrayList<Integer>(Arrays.asList(9,9)));
		encoderTable.put('y', new ArrayList<Integer>(Arrays.asList(9,9,9)));
		encoderTable.put('z', new ArrayList<Integer>(Arrays.asList(9,9,9,9)));

		return encoderTable.get(Character.toLowerCase(ch));
	}
}
