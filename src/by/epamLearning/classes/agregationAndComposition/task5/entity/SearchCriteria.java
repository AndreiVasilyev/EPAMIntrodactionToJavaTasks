package by.epamLearning.classes.agregationAndComposition.task5.entity;

public class SearchCriteria {
	private VoucherType type;
	private Food food;
	private Transport transport;
	private int days;

	public SearchCriteria() {
		super();
	}

	public SearchCriteria(VoucherType type, Food food, Transport transport, int days) {
		super();
		this.type = type;
		this.food = food;
		this.transport = transport;
		this.days = days;
	}

	public VoucherType getType() {
		return type;
	}

	public void setType(VoucherType type) {
		this.type = type;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}

	public Transport getTransport() {
		return transport;
	}

	public void setTransport(Transport transport) {
		this.transport = transport;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + days;
		result = prime * result + ((food == null) ? 0 : food.hashCode());
		result = prime * result + ((transport == null) ? 0 : transport.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		SearchCriteria other = (SearchCriteria) obj;
		if (days != other.days)
			return false;
		if (food != other.food)
			return false;
		if (transport != other.transport)
			return false;
		if (type != other.type)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "SearchCriteria [type=" + type + ", food=" + food + ", transport=" + transport + ", days=" + days + "]";
	}

}
