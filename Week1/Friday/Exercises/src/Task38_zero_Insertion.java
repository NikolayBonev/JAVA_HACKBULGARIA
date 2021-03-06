import java.math.BigInteger;

public class Task38_zero_Insertion {
	static int zero_insert(int n){
		
		String oldNumber = Integer.toString(n);
		StringBuilder number = new StringBuilder(oldNumber.length());
		boolean flag =false;
		
		number.append(oldNumber.charAt(0));
		
		for(int i = 0; i < oldNumber.length() - 1; i++){
			boolean equalNeighbors = Character.valueOf(oldNumber.charAt(i)).equals(Character.valueOf(oldNumber.charAt(i+1)));
			boolean moduleCheckTrue = (Character.getNumericValue(oldNumber.charAt(i)) + Character.getNumericValue(oldNumber.charAt(i+1))) %10 == 0;
			
			if(equalNeighbors || moduleCheckTrue){
				flag = true;
			}else{
				number.append(oldNumber.charAt(i+1));
			}
			
			if(flag){
				number.append("0");
				number.append(oldNumber.charAt(i+1));
				
				flag = false;
			}
		}
		
		BigInteger result = new BigInteger(number.toString());
		
		if(BigInteger.valueOf(Integer.MAX_VALUE).compareTo(result) < 0){
			return -1;
		}
		
		return Integer.parseInt(number.toString());
	}
}
