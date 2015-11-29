import java.util.Arrays;

public class Task04_kthMinElement {
	static int kthMin(int k, int[] array){
		Arrays.sort(array);
		
		return array[k];
	}
}
