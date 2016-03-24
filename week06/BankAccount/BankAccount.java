package BankAccount;

import java.util.ArrayList;

public class BankAccount {
	private final String firstName;
	private final String lastName;
	private final Integer age;

	private final Double balance;
	private final Double interest;
	private final String typeInterest;
	private final ArrayList<String> operations = new ArrayList<>();
	private final ArrayList<String> history;

	public BankAccount(String firstName, String lastName, Integer age, Double balance, Double interest,
			String typeInterest) throws WrongDataException {
		validation(firstName, lastName, age, balance, interest, typeInterest);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.balance = balance;
		this.interest = interest;
		this.typeInterest = typeInterest;
		this.history = new ArrayList<>();
		this.history.addAll(operations);
		
	}

	public void validateName(String name) throws WrongDataException {
		char firstChar = name.charAt(0);
		if (!Character.isUpperCase(firstChar)) {
			throw new WrongDataException("Wrong name!");
		}
		for (int i = 1; i < name.length(); i++) {
			char chars = name.charAt(i);
			if (!Character.isLowerCase(chars)) {
				throw new WrongDataException("Wrong name!");
			}
		}
	}
	
	public void validateFullName(String firstName, String lastName) throws WrongDataException{
		validateName(firstName);
		validateName(lastName);
	}
	
	public void validateAge(Integer age) throws WrongDataException{
		if(age < 18 || age > 100){
			throw new WrongDataException("Wrong age!");
		}
	}
	
	public void validateMoney(Double balance) throws WrongDataException{
		if(balance < 0){
			throw new WrongDataException("Wrong balance!");
		}
	}
	
	public void validateInterestAndType(Double interest, String typeInterest) throws WrongDataException{
		if(interest < 0 || interest > 100){
			throw new WrongDataException("Wrong interest %");
		}
		if(typeInterest.equals("complex") || typeInterest.equals("simple")){
			throw new WrongDataException("Wrong type of interest");
		}
	}

	public void validation(String firstName, String lastName, Integer age, Double balance, Double interest,
			String typeInterest) throws WrongDataException {
		validateFullName(firstName, lastName);
		validateAge(age);
		validateMoney(balance);
		validateInterestAndType(interest, typeInterest);

	}
	
	public BankAccount add(Double money) throws WrongDataException{
		validateMoney(money);
		operations.add("Add");
		return new BankAccount(this.firstName, this.lastName, this.age, this.balance + money, this.interest, this.typeInterest);
	}
	
	public BankAccount withdraw(Double money) throws WrongDataException{
		validateMoney(money);
		if(this.interest < 1){
			throw new WrongDataException("Withdraw is forbidden!");
		}
		operations.add("Withdraw");
		return new BankAccount(this.firstName, this.lastName, this.age, this.balance - money, this.interest, this.typeInterest);
	}

	public void showHistory(){
		for (int i = 0; i < history.size(); i++) {
			System.out.println(i + history.get(i));
		}
	}
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getInterest() {
		return interest;
	}

}
