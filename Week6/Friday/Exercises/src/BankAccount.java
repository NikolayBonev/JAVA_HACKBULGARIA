import java.io.*;
import java.util.*;

public class BankAccount implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String firstName;
	private String lastName;
	private int age;
	private String id;
	private double balance;
	private double interest;
	private boolean typeInterest;
	private List<String> history = new ArrayList<String>();
	
	public BankAccount(String firstName, String lastName, int age, double balance, double interest, boolean typeInterest) {
		setFirstName(firstName);
		setLastName(lastName);
		setAge(age);
		
		if(balance < 0){
			throw new IllegalArgumentException("Balance can't be negative!");
		}
		
		setId(UUID.randomUUID().toString());
		setBalance(balance);
		setInterest(interest);
		setTypeInterest(typeInterest);
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	public void setFirstName(String firstName) {
		if(firstName.length() == 0 || firstName.matches("^[\\w+]")){
			throw new IllegalArgumentException("Invalid first name!");
		}
		this.firstName = firstName;
	}
	public String getLastName() {
		return this.lastName;
	}
	public void setLastName(String lastName) {
		if(lastName.length() == 0 || lastName.matches("^[\\w+]")){
			throw new IllegalArgumentException("Invalid last name!");
		}
		
		this.lastName = lastName;
	}
	public int getAge() {
		return this.age;
	}
	public void setAge(int age) {
		if(age < 0){
			throw new IllegalArgumentException("The age has to be greater than zero!");
		}
		
		this.age = age;
	}
	public String getId() {
		return this.id;
	}
	private void setId(String id) {
		this.id = id;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getInterest() {
		return this.interest;
	}
	public void setInterest(double interest) {		
		this.interest = interest;
	}
	public boolean getTypeInterest() {
		return this.typeInterest;
	}
	public void setTypeInterest(boolean typeInterest) {
		this.typeInterest = typeInterest;
	}
	
	public void add(double sum){
		this.setBalance(this.getBalance() + sum);
		setHistory("Add" + sum);
	}
	
	public void withdraw(double sum) throws InsufficientFundsException{
		if(this.balance < sum){
			throw new InsufficientFundsException();
		}
		
		if(this.interest <= 1){
			this.setBalance(this.getBalance() - sum);
			setHistory("Withdraw" + sum);
		}else{
			System.out.println("Can't withdraw!");
		}
	}
	
	private void setHistory(String operation){
		if(this.history.size() < 5){
			this.history.add(operation);
		}else{
			this.history.remove(0);
			this.history.add(operation);
		}
	}
	
	public void getHistory(){
		for(String record : history){
			System.out.println(record);
		}
	}
	
	public double calculateAmount(int months){
		double amount = this.balance;
		
		if(this.typeInterest){
			double value = (amount*this.interest)/100;
			
			for(int i = 0 ; i < months ; i++){
				amount += value;
			}
		}else{
			for(int i = 0 ; i < months ; i++){
				amount += (amount/100)*this.interest; 
			}
		}
		
		return amount;
	}
}
