
public class Task05_getAverage {
	static int getAverage(int[] array){
		int average = 0 ;
		
		for(int i = 0 ; i < array.length ; i++){
			average+=array[i];
		}
		
		return average/array.length;
	}
}
