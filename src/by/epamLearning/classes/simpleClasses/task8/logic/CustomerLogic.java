package by.epamLearning.classes.simpleClasses.task8.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epamLearning.classes.simpleClasses.task8.entity.Customer;

public class CustomerLogic {

	public List<Customer> sortCustomersAlphabetically(List<Customer> customers) {
		List<Customer> sortedCustomers = new ArrayList<Customer>(customers);
		sortedCustomers.sort(new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				if (isNameValid(o1) && isNameValid(o2)) {
					if (!o1.getSurname().equalsIgnoreCase(o2.getSurname())) {
						return o1.getSurname().compareToIgnoreCase(o2.getSurname());
					} else {
						if (!o1.getFistname().equalsIgnoreCase(o2.getFistname())) {
							return o1.getFistname().compareToIgnoreCase(o2.getFistname());
						} else {
							return o1.getPatronymic().compareToIgnoreCase(o2.getPatronymic());
						}
					}
				}
				return 0;
			}
		});
		return sortedCustomers;
	}

	public List<Customer> findCustomersByCreditCartNumberRange(long startRange, long endRange, List<Customer> customers) {
		List<Customer> foundCustomers=new ArrayList<Customer>();
		long creditCardNumber;
		for (Customer customer : customers) {
			if (isCustomerValid(customer)) {
				creditCardNumber = customer.getCreditCardNumber();
				if (creditCardNumber >= startRange && creditCardNumber <= endRange) {
					foundCustomers.add(customer);
				}
			}
		}
		return foundCustomers;
	}

	private boolean isCustomerValid(Customer customer) {
		if (customer != null && customer.getId() != 0) {
			if (isNameValid(customer) && isAdressValid(customer) && isBankDataValid(customer)) {
				return true;
			}
		}
		return false;
	}

	private boolean isBankDataValid(Customer customer) {
		if (customer != null) {
			if (customer.getBankAcountNumber() != 0 && customer.getCreditCardNumber() != 0) {
				return true;
			}
		}
		return false;
	}

	private boolean isAdressValid(Customer customer) {
		if (customer != null) {
			if (customer.getAdress() != null && !customer.getAdress().isBlank()) {
				return true;
			}
		}
		return false;
	}

	private boolean isNameValid(Customer customer) {
		if (customer != null) {
			if (customer.getFistname() != null && !customer.getFistname().isBlank()) {
				if (customer.getSurname() != null && !customer.getSurname().isBlank()) {
					if (customer.getPatronymic() != null && !customer.getPatronymic().isBlank()) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
