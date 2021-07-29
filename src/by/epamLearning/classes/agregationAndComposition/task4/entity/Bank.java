package by.epamLearning.classes.agregationAndComposition.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Bank {

	private String name;
	private String iban;
	private List<Client> clients;

	public Bank() {
		super();
		this.clients = new ArrayList<>();
	}

	public Bank(String name, String iban) {
		this();
		this.name = name;
		this.iban = iban;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public List<Client> getClients() {
		return clients;
	}
	
	public void addClient() {
		this.clients.add(new Client());
	}

	public void addClient(String name) {
		this.clients.add(new Client(name));
	}
}
