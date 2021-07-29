package by.epamLearning.classes.agregationAndComposition.task4.view;

import java.util.List;

import by.epamLearning.classes.agregationAndComposition.task4.entity.Account;
import by.epamLearning.classes.agregationAndComposition.task4.entity.Client;

public class BankView {

	public void print(String message, String value) {
		System.out.println("\n" + message + ": " + value);
	}

	public void print(String message, List<Client> clients) {
		System.out.println("\n" + message + ": ");
		for (Client client : clients) {
			System.out.println("\t" + client.getName());
			for (Account account : client.getAccounts()) {
				System.out.printf("\t\t%d  %s  %d\n", account.getNumber(), account.isBlocked(), account.getAmount());
			}
		}
	}

	public void printAccounts(String message, List<Account> accounts) {
		System.out.println("\n" + message + ": ");
		for (Account account : accounts) {
			System.out.printf("\t\t%d  %s  %d\n", account.getNumber(), account.isBlocked(), account.getAmount());

		}
	}

	public void print(String message, Account account) {
		System.out.println("\n" + message + ": ");
		System.out.printf("\t\t%d  %s  %d\n", account.getNumber(), account.isBlocked(), account.getAmount());
	}
}
