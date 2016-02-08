import java.util.ArrayList;
import java.util.List;

public class UserInputChecker {

	interface Validator{
		 public boolean validate(String input);
	}
	
	class PersonNameValidator implements Validator{
		@Override
		public boolean validate(String input) {			
			return input.matches(RegexStrings.PERSONNAME);
		}
	}
	
	class BulgarianPhoneNumberValidator implements Validator{
		@Override
		public boolean validate(String input) {			
			return input.matches(RegexStrings.BULGARIAPHONENUMBER);
		}
	}
	
	class PersonAgeValidator implements Validator{
		@Override
		public boolean validate(String input) {
			return input.matches(RegexStrings.PERSONAGE);
		}
	}

	class CreditCardNumberValidator implements Validator{
		@Override
		public boolean validate(String input) {
			int number = Integer.valueOf(input);
            List<Integer> digits = new ArrayList<>();
            int checkDigit = number%10;
            
            while(number > 0) {
                digits.add(number % 10);
                number /= 10;
            }
            
            for (int i = 1; i < digits.size(); i+=2) {
                int current = digits.remove(i);
                	
                current = current * 2;
                	
                if(current > 9){
                	current = current/10 + current%10;
                }
                
                digits.add(i, current);
            }

            int sum = digits.stream().reduce(0, (a, b) -> a + b);
            int checkDigitCalculated = (sum * 9) % 10;
            
			return checkDigit == checkDigitCalculated;
		}
	}

	class IpVersion4Validator implements Validator{
		@Override
		public boolean validate(String input) {
			return input.matches(RegexStrings.IPVERSION4);
		}
	}

	class IpVersion6Validator implements Validator{
		@Override
		public boolean validate(String input) {
			return input.matches(RegexStrings.IPVERSION6);
		}
	}

	class MacAddressValidator implements Validator{
		@Override
		public boolean validate(String input) {
			return input.matches(RegexStrings.MACADDRESS);
		}
	}
}
