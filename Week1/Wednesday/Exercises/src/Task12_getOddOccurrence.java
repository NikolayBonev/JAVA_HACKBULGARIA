
public class Task12_getOddOccurrence {
	static int getOddOccurrence(int... array){
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
}
