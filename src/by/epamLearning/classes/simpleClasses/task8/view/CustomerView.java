package by.epamLearning.classes.simpleClasses.task8.view;

import java.util.List;

import by.epamLearning.classes.simpleClasses.task8.entity.Customer;

public class CustomerView {

	public void print(String message, List<Customer> customers) {
		System.out.println("\n" + message + "\n");
		for (Customer customer : customers) {
			print(customer);
		}
	}

	public void print(Customer customer) {
		System.out.printf("%d. %s %s %s\n", customer.getId(), customer.getSurname(), customer.getFistname(),
				customer.getPatronymic());
		System.out.printf("adress: %s\n", customer.getAdress());
		System.out.printf("card: %d, account: %d\n", customer.getCreditCardNumber(), customer.getBankAcountNumber());
	}
}
