import java.util.Arrays;

public class Task03_minElement {
	static int min(int... array){
		Arrays.sort(array);
		
		return array[0];
	}
}
