package BankAccount;

import java.io.IOException;

import BankAccount.TheBank.InvalidTransferException;

public interface CLI {
	public void createBankAccount() throws IOException, WrongDataException;
	public void showHistory() throws IOException;
	public void addMoney() throws WrongDataException, IOException;
	public void withdrawMoney() throws WrongDataException, IOException;
	public void transferMoney() throws WrongDataException, IOException, InvalidTransferException;
	public void calculateAmount() throws IOException;
}
