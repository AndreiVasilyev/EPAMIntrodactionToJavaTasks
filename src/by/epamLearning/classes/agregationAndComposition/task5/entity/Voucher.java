package by.epamLearning.classes.agregationAndComposition.task5.entity;

public class Voucher {

	private String destination;
	private VoucherType type;
	private int daysQuantity;
	private Food food;
	private Transport transport;
	private int cost;

	public Voucher() {
	}

	public Voucher(String destination, VoucherType type, int daysQuantity, Food food, Transport transport, int cost) {
		this.destination = destination;
		this.type = type;
		this.daysQuantity = daysQuantity;
		this.food = food;
		this.transport = transport;
		this.cost = cost;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public VoucherType getType() {
		return type;
	}

	public void setType(VoucherType type) {
		this.type = type;
	}

	public int getDaysQuantity() {
		return daysQuantity;
	}

	public void setDaysQuantity(int daysQuantity) {
		this.daysQuantity = daysQuantity;
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

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cost;
		result = prime * result + daysQuantity;
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
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
		Voucher other = (Voucher) obj;
		if (cost != other.cost)
			return false;
		if (daysQuantity != other.daysQuantity)
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
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
		return "Voucher [destination=" + destination + ", type=" + type + ", daysQuantity=" + daysQuantity + ", food="
				+ food + ", transport=" + transport + ", cost=" + cost + "]";
	}
}
