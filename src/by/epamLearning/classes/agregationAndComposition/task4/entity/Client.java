package by.epamLearning.classes.agregationAndComposition.task4.entity;

import java.util.ArrayList;
import java.util.List;

public class Client {

	private String name;
	private List<Account> accounts;

	public Client() {
		super();
		accounts = new ArrayList<>();
	}

	public Client(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Account> getAccounts() {
		return accounts;
	}

	public void addAccount() {
		this.accounts.add(new Account());
	}

	public void addAccount(long number, boolean isBlocked, int amount) {
		this.accounts.add(new Account(number, isBlocked, amount));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accounts == null) ? 0 : accounts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		if (accounts == null) {
			if (other.accounts != null)
				return false;
		} else if (!accounts.equals(other.accounts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Client [name=" + name + ", accounts=" + accounts + "]";
	}

}
