package by.epamLearning.classes.agregationAndComposition.task4.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epamLearning.classes.agregationAndComposition.task4.entity.Account;
import by.epamLearning.classes.agregationAndComposition.task4.entity.Bank;
import by.epamLearning.classes.agregationAndComposition.task4.entity.Client;

public class BankLogic {

	public List<Account> getAllAccounts(Bank bank) {
		List<Account> allAccounts = new ArrayList<>();
		if (bank != null) {
			for (Client client : bank.getClients()) {
				if (client != null) {
					for (Account account : client.getAccounts()) {
						if (account != null) {
							allAccounts.add(account);
						}
					}
				}
			}
		}
		return allAccounts;
	}

	public Account findAccount(long number, Bank bank) {
		for (Account account : getAllAccounts(bank)) {
			if (number == account.getNumber()) {
				return account;
			}
		}
		return null;
	}

	public void blockAccount(long number, Bank bank) {
		Account account = findAccount(number, bank);
		account.setBlocked(true);
	}

	public void unblockAccount(long number, Bank bank) {
		Account account = findAccount(number, bank);
		account.setBlocked(false);
	}

	public List<Account> sortAccountsAscending(Bank bank) {
		List<Account> accounts = getAllAccounts(bank);
		accounts.sort(new Comparator<Account>() {
			@Override
			public int compare(Account o1, Account o2) {
				long difference = o1.getNumber() - o2.getNumber();
				return difference > 0 ? 1 : difference == 0 ? 0 : -1;
			}
		});
		return accounts;
	}

	public List<Account> sortAccountsDescending(Bank bank) {
		List<Account> accounts = getAllAccounts(bank);
		accounts.sort(new Comparator<Account>() {
			@Override
			public int compare(Account o1, Account o2) {
				long difference = o1.getNumber() - o2.getNumber();
				return difference > 0 ? -1 : difference == 0 ? 0 : 1;
			}
		});
		return accounts;
	}

	public long getTotalAmountOfAccounts(Bank bank) {
		long totalAmountOfAccounts = 0;
		for (Account account : getAllAccounts(bank)) {
			totalAmountOfAccounts += account.getAmount();
		}
		return totalAmountOfAccounts;
	}

	public long getTotalAmountOfAccountsWithPositiveBalance(Bank bank) {
		long totalAmountOfAccountsWithPositiveBalance = 0;
		int currentAmount = 0;
		for (Account account : getAllAccounts(bank)) {
			currentAmount = account.getAmount();
			if (currentAmount > 0) {
				totalAmountOfAccountsWithPositiveBalance += currentAmount;
			}
		}
		return totalAmountOfAccountsWithPositiveBalance;
	}

	public long getTotalAmountOfAccountsWithNegativeBalance(Bank bank) {
		long totalAmountOfAccountsWithNegativeBalance = 0;
		int currentAmount = 0;
		for (Account account : getAllAccounts(bank)) {
			currentAmount = account.getAmount();
			if (currentAmount < 0) {
				totalAmountOfAccountsWithNegativeBalance += currentAmount;
			}
		}
		return totalAmountOfAccountsWithNegativeBalance;
	}

	public Client getClient(String name, Bank bank) {
		if (name != null && !name.isBlank()) {
			for (Client client : bank.getClients()) {
				if (name.equalsIgnoreCase(client.getName())) {
					return client;
				}
			}
		}
		return null;
	}

}
