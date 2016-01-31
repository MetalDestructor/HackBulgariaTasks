package BankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheBank implements CLI {
	private final ArrayList<BankAccount> accounts;
	private BankAccount current;
	private BufferedReader reader;

	public TheBank() {
		accounts = new ArrayList<>();
		reader = new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public void createBankAccount() throws IOException, WrongDataException {
		System.out.print("First name:");
		String fName = reader.readLine();
		System.out.print("Last name:");
		String lName = reader.readLine();
		System.out.print("Age:");
		Integer age = Integer.parseInt(reader.readLine());
		System.out.print("Balance:");
		Double balance = Double.parseDouble(reader.readLine());
		System.out.print("Interest(in %):");
		Double interest = Double.parseDouble(reader.readLine());
		System.out.print("Type of interest(complex or simple):");
		String typeInterest = reader.readLine();
		accounts.add(new BankAccount(fName, lName, age, balance, interest, typeInterest));
		current = accounts.get(accounts.size());
	}

	@Override
	public void showHistory() throws IOException {
		System.out.print("Current or custom?");
		String res = reader.readLine();
		if (res.equals("current")) {
			current.showHistory();
		} else {
			System.out.print("Account's first name: ");
			String acc = reader.readLine();
			int i = accounts.indexOf(acc);
			accounts.get(i).showHistory();
		}

	}

	@Override
	public void addMoney() throws WrongDataException, IOException {
		System.out.println("Amount: ");
		Double money = Double.parseDouble(reader.readLine());
		System.out.print("Current or custom?");
		String res = reader.readLine();
		if (res.equals("current")) {
			current.add(money);
		} else {
			System.out.print("Account's first name: ");
			String acc = reader.readLine();
			int i = accounts.indexOf(acc);
			accounts.get(i).add(money);
		}
	}

	@Override
	public void withdrawMoney() throws WrongDataException, IOException {
		System.out.println("Amount: ");
		Double money = Double.parseDouble(reader.readLine());
		System.out.print("Current or custom?");
		String res = reader.readLine();
		if (res.equals("current")) {
			current.withdraw(money);
		} else {
			System.out.print("Account's first name: ");
			String acc = reader.readLine();
			int i = accounts.indexOf(acc);
			accounts.get(i).withdraw(money);
		}
	}

	@Override
	public void transferMoney() throws WrongDataException, IOException, InvalidTransferException {
		System.out.println("Amount: ");
		Double money = Double.parseDouble(reader.readLine());
		System.out.print("From(current or custom):");
		String from = reader.readLine();
		if (from.equals("current")) {
			System.out.print("To(current or custom): ");
			String to = reader.readLine();
			if (to.equals("current")) {
				throw new InvalidTransferException("You cannot tranfer from current to current!");
			}
			else{
				System.out.print("To(account's first name): ");
				String customTo = reader.readLine();
				int i = accounts.indexOf(customTo);
				BankAccount customToAcc = accounts.get(i);
				transfer(current, customToAcc, money);
			}
		}
		else{
			System.out.print("From(account's first name): ");
			String customFrom = reader.readLine();
			int i = accounts.indexOf(customFrom);
			BankAccount customFromAcc = accounts.get(i);
			System.out.print("To(current or custom): ");
			String to = reader.readLine();
			if (to.equals("current")) {
				transfer(customFromAcc, current, money);
			}
			else{
				System.out.print("To(account's first name): ");
				String customTo = reader.readLine();
				int index = accounts.indexOf(customTo);
				BankAccount customToAcc = accounts.get(index);
				transfer(current, customToAcc, money);
			}
		}
	}

	@Override
	public void calculateAmount() throws IOException {
		System.out.print("Current or custom?");
		String res = reader.readLine();
		if (res.equals("current")) {
			current.getBalance();
		} else {
			System.out.print("Account's first name: ");
			String acc = reader.readLine();
			int i = accounts.indexOf(acc);
			accounts.get(i).getBalance();
		}
	}

	public void transfer(BankAccount from, BankAccount to, Double amount) throws WrongDataException {
		from.withdraw(amount);
		to.add(amount);
	}

	public class InvalidAccountNameException extends Exception {
		public InvalidAccountNameException(String msg){
			super(msg);
		}
	}
	public class InvalidTransferException extends Exception {
		public InvalidTransferException(String msg){
			super(msg);
		}
	}
}
