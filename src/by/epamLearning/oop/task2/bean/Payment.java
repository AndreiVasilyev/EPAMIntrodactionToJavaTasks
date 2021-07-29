package by.epamLearning.oop.task2.bean;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Payment {

	private long id;
	private Date date;
	private Map<Product, Integer> products;

	public Payment() {
		super();
		products = new HashMap<>();
		date = new Date();
	}

	public Payment(long id, Map<Product, Integer> products) {
		this();
		this.id = id;
		this.products = products;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}

	public void setProducts(Map<Product, Integer> products) {
		this.products = products;
	}

	public static class Product implements Comparable<Product> {

		private long id;
		private String name;
		private String description;
		private int cost;

		public Product() {
			super();
		}

		public Product(long id, String name, String description, int cost) {
			super();
			this.id = id;
			this.name = name;
			this.description = description;
			this.cost = cost;
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

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public int getCost() {
			return cost;
		}

		public void setCost(int cost) {
			this.cost = cost;
		}

		@Override
		public int compareTo(Product o) {
			return id > o.getId() ? 1 : id == o.getId() ? 0 : -1;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + cost;
			result = prime * result + ((description == null) ? 0 : description.hashCode());
			result = prime * result + (int) (id ^ (id >>> 32));
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
			Product other = (Product) obj;
			if (cost != other.cost)
				return false;
			if (description == null) {
				if (other.description != null)
					return false;
			} else if (!description.equals(other.description))
				return false;
			if (id != other.id)
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
			return "Product [id=" + id + ", name=" + name + ", description=" + description + ", cost=" + cost + "]";
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((products == null) ? 0 : products.hashCode());
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
		Payment other = (Payment) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id != other.id)
			return false;
		if (products == null) {
			if (other.products != null)
				return false;
		} else if (!products.equals(other.products))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Payment [id=" + id + ", date=" + date + ", products=" + products + "]";
	}
}
