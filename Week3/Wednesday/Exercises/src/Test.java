import java.util.Map;

import Statistics.*;

public class Test {
	public static void main(String args[]){
		String test = "Ninjas are all over the place! We are all going to die!";
		
		Map<String, Integer> result = UtilityMethods.textToMap(test);
		System.out.println(UtilityMethods.hashMapToText(result));
	}
}
