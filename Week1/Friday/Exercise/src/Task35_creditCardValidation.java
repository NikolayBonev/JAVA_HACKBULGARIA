
public class Task35_creditCardValidation {
	static boolean is_credit_card_valid(String number){
		
		if(number.length()%2 == 0){
			return false;
		}
		
		StringBuilder newNumber = new StringBuilder();
		int sum = 0;
		
		for(int i = 0 ; i < number.length() ; i++){
			
			if(i%2 == 0){
				sum+=Integer.parseInt(number.charAt(i) + "");
			}else{
				int swapInt = Integer.parseInt(number.charAt(i) + "");
				
				newNumber.append(2*swapInt);
			}
		}
		
		for(int i = 0; i < newNumber.length() ; i++){
			sum+=Integer.parseInt(newNumber.charAt(i) + "");
		}
		
		if(sum%10 != 0){
			return false;
		}
		
		return true;
	}
}
