import java.util.HashMap;
import java.util.Map;

public class Bank {
	Map<String, BankAccount> acc = null;
	
	public Bank() {
		acc = new HashMap<>();
	}

	public BankAccount getAccount(String id) throws NonExistingBankAccountException{
		if(!acc.containsKey(id)){
			throw new NonExistingBankAccountException();
		}
		
		return acc.get(id);
	}
	
	public void setAccount(BankAccount account){
		acc.put(account.getId(), account);
	}
	
	public void transfer(String usrId, String destId, double sum) throws InsufficientFundsException{
		acc.get(usrId).withdraw(sum);
		acc.get(destId).add(sum);
	}
}