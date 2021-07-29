package by.epamLearning.classes.agregationAndComposition.task4.entity;

public class Account {

	private long number;
	private boolean isBlocked;
	private int amount;
	
	public Account() {
		super();
	}

	public Account(long number, boolean isBlocked, int amount) {
		super();
		this.number = number;
		this.isBlocked = isBlocked;
		this.amount = amount;
	}

	public long getNumber() {
		return number;
	}

	public void setNumber(long number) {
		this.number = number;
	}

	public boolean isBlocked() {
		return isBlocked;
	}

	public void setBlocked(boolean isBlocked) {
		this.isBlocked = isBlocked;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		result = prime * result + (isBlocked ? 1231 : 1237);
		result = prime * result + (int) (number ^ (number >>> 32));
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
		Account other = (Account) obj;
		if (amount != other.amount)
			return false;
		if (isBlocked != other.isBlocked)
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", isBlocked=" + isBlocked + ", amount=" + amount + "]";
	}
			
}
