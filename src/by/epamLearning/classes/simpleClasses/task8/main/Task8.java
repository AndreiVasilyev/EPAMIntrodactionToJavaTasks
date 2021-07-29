package by.epamLearning.classes.simpleClasses.task8.main;

import by.epamLearning.classes.simpleClasses.task8.entity.Customer;
import by.epamLearning.classes.simpleClasses.task8.entity.Customers;
import by.epamLearning.classes.simpleClasses.task8.logic.CustomerLogic;
import by.epamLearning.classes.simpleClasses.task8.view.CustomerView;

public class Task8 {

	public static void main(String[] args) {
		Customers customers = new Customers();
		CustomerLogic customerLogic = new CustomerLogic();
		CustomerView customerView = new CustomerView();
		addDemoCustomers(customers);
		customerView.print("All customers: ", customers.getCustomers());
		customerView.print("Sorted customers: ", customerLogic.sortCustomersAlphabetically(customers.getCustomers()));
		customerView.print("Customers with cards between (0,5300000000): ",
				customerLogic.findCustomersByCreditCartNumberRange(0l, 5300000000l, customers.getCustomers()));
	}

	private static void addDemoCustomers(Customers customers) {
		Customer customer = new Customer();
		customer.setId(1);
		customer.setSurname("Ivanov");
		customer.setFistname("Ivan");
		customer.setPatronymic("Ivanovich");
		customer.setAdress("Pushkin str, 8");
		customer.setCreditCardNumber(546489512365l);
		customer.setBankAcountNumber(4568435213518132l);
		customers.addCustomer(customer);

		customer = new Customer();
		customer.setId(2);
		customer.setSurname("Petrov");
		customer.setFistname("Petr");
		customer.setPatronymic("Petrovich");
		customer.setAdress("Tolstoy str, 12");
		customer.setCreditCardNumber(5464874365l);
		customer.setBankAcountNumber(45684352454568132l);
		customers.addCustomer(customer);

		customer = new Customer();
		customer.setId(3);
		customer.setSurname("Sidorov");
		customer.setFistname("Sidor");
		customer.setPatronymic("Sidorovich");
		customer.setAdress("Lenin str, 23");
		customer.setCreditCardNumber(5464745362l);
		customer.setBankAcountNumber(4568478589668132l);
		customers.addCustomer(customer);

		customer = new Customer();
		customer.setId(4);
		customer.setSurname("Vasilyev");
		customer.setFistname("Vasiliy");
		customer.setPatronymic("Vasilyevich");
		customer.setAdress("Central str, 85");
		customer.setCreditCardNumber(2341234365l);
		customer.setBankAcountNumber(4565786567354568132l);
		customers.addCustomer(customer);

		customer = new Customer();
		customer.setId(5);
		customer.setSurname("Nikolaev");
		customer.setFistname("Nikolay");
		customer.setPatronymic("Nikolaevich");
		customer.setAdress("Stroiteley str, 58");
		customer.setCreditCardNumber(5423374365l);
		customer.setBankAcountNumber(45684444444568132l);
		customers.addCustomer(customer);

		customer = new Customer();
		customer.setId(6);
		customer.setSurname("Ivanov");
		customer.setFistname("Sergey");
		customer.setPatronymic("Ivanovich");
		customer.setAdress("Pushkin str, 34");
		customer.setCreditCardNumber(546555512365l);
		customer.setBankAcountNumber(4568898789518132l);
		customers.addCustomer(customer);

		customer = new Customer();
		customer.setId(7);
		customer.setSurname("Vasilyev");
		customer.setFistname("Vasiliy");
		customer.setPatronymic("Viktorovich");
		customer.setAdress("Sunny str, 112");
		customer.setCreditCardNumber(2341234365l);
		customer.setBankAcountNumber(3333378656735468132l);
		customers.addCustomer(customer);

		customer = new Customer();
		customer.setId(8);
		customer.setSurname("Viktorov");
		customer.setFistname("Viktor");
		customer.setPatronymic("Viktorovich");
		customer.setAdress("Svobody sqr, 55");
		customer.setCreditCardNumber(5541555365l);
		customer.setBankAcountNumber(333335673545698132l);
		customers.addCustomer(customer);
	}
}
