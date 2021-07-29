package by.epamLearning.oop.task5.bean;

public class Sweetness {

	private String type;
	private String name;
	private int weight;
	private String filling;
	private String wrapping;
	private int price;

	public Sweetness() {
	}

	public Sweetness(String type, String name, int weight, String filling, String wrapping, int price) {
		super();
		this.type = type;
		this.name = name;
		this.weight = weight;
		this.filling = filling;
		this.wrapping = wrapping;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public String getFilling() {
		return filling;
	}

	public String getWrapping() {
		return wrapping;
	}

	public int getPrice() {
		return price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((filling == null) ? 0 : filling.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + price;
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		result = prime * result + weight;
		result = prime * result + ((wrapping == null) ? 0 : wrapping.hashCode());
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
		Sweetness other = (Sweetness) obj;
		if (filling == null) {
			if (other.filling != null)
				return false;
		} else if (!filling.equals(other.filling))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (price != other.price)
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (weight != other.weight)
			return false;
		if (wrapping == null) {
			if (other.wrapping != null)
				return false;
		} else if (!wrapping.equals(other.wrapping))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Sweetness [type=" + type + ", name=" + name + ", weight=" + weight + ", filling=" + filling
				+ ", wrapping=" + wrapping + ", price=" + price + "]";
	}

}
