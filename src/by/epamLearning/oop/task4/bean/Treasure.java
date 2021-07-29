package by.epamLearning.oop.task4.bean;

import java.io.Serializable;

public class Treasure implements Serializable, Comparable<Treasure> {

	private static final long serialVersionUID = 1L;

	private long id;
	private String name;
	private int price;

	public Treasure() {
	}

	public Treasure(long id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Treasure o) {
		return price > o.getPrice() ? 1 : price == o.getPrice() ? 0 : -1;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
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
		Treasure other = (Treasure) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Treasure [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}
