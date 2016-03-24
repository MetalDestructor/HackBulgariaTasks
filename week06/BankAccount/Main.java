package BankAccount;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import BankAccount.TheBank.InvalidTransferException;

public class Main {

	public static void main(String[] args) throws IOException, WrongDataException, InvalidTransferException {
		readCommandLine();
	}

	private static void readCommandLine() throws IOException, WrongDataException, InvalidTransferException {
		TheBank bank = new TheBank();
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			System.out.print("Enter command: ");
			String cmd = reader.readLine();
			switch(cmd){
			case "create_bank_account": bank.createBankAccount(); break;
			case "show_history": bank.showHistory(); break;
			case "add_money": bank.addMoney(); break;
			case "withdraw_money": bank.withdrawMoney(); break;
			case "transfer_money": bank.transferMoney(); break;
			case "calculate_amount": bank.calculateAmount(); break;
			default: System.err.println("Invalid command!");
			}
		}
	}

}
