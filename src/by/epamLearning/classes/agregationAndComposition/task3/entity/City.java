package by.epamLearning.classes.agregationAndComposition.task3.entity;

public class City {

	private String name;
	private long population;
	private int square;

	public City() {
		super();
	}

	public City(String name, long population, int square) {
		super();
		this.name = name;
		this.population = population;
		this.square = square;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public int getSquare() {
		return square;
	}

	public void setSquare(int square) {
		this.square = square;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (population ^ (population >>> 32));
		result = prime * result + square;
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
		City other = (City) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		if (square != other.square)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + ", square=" + square + "]";
	}

}
