package exercises;

public class FindMinElement {
	public static <T extends Comparable<T>>  T findMin(T[] array){
		T minElement = array[0];
		
		for(int i = 1 ; i < array.length ; i++){
			if(array[i].compareTo(minElement) < 0){
				minElement = array[i];
			}
		}
		
		return minElement;
	}
}
