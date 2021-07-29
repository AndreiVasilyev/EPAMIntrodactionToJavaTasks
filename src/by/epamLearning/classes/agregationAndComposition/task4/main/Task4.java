package by.epamLearning.classes.agregationAndComposition.task4.main;

import by.epamLearning.classes.agregationAndComposition.task4.entity.Bank;
import by.epamLearning.classes.agregationAndComposition.task4.logic.BankLogic;
import by.epamLearning.classes.agregationAndComposition.task4.view.BankView;

public class Task4 {

	public static void main(String[] args) {
		Bank bank = new Bank("Priorbank", "IBAN24GDFRW");
		BankLogic bankLogic = new BankLogic();
		BankView bankView = new BankView();
		bank.addClient("Ivan Ivanov");
		bankLogic.getClient("Ivan Ivanov", bank).addAccount(456845778466l, false, 5000);
		bankLogic.getClient("Ivan Ivanov", bank).addAccount(855256655466l, false, 10000);
		bank.addClient("Petr Petrov");
		bankLogic.getClient("Petr Petrov", bank).addAccount(855254323424l, false, 7000);
		bank.addClient("Nikolay Nikolaev");
		bankLogic.getClient("Nikolay Nikolaev", bank).addAccount(555254323424l, true, -4500);
		bankView.print("all clients", bank.getClients());
		bankView.printAccounts("all accounts", bankLogic.getAllAccounts(bank));
		bankView.printAccounts("all accounts after ascending sorting", bankLogic.sortAccountsAscending(bank));
		bankView.printAccounts("all accounts after descending sorting", bankLogic.sortAccountsDescending(bank));
		bankView.print("found account info", bankLogic.findAccount(456845778466l, bank));
		bankView.print("total amount", String.valueOf(bankLogic.getTotalAmountOfAccounts(bank)));
		bankView.print("total amount of accounts with positive balance",
				String.valueOf(bankLogic.getTotalAmountOfAccountsWithPositiveBalance(bank)));
		bankView.print("total amount of accounts with negative balance",
				String.valueOf(bankLogic.getTotalAmountOfAccountsWithNegativeBalance(bank)));
	}

}
