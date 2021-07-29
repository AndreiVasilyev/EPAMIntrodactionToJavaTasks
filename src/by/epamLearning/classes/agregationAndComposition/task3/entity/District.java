package by.epamLearning.classes.agregationAndComposition.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class District {

	private String name;
	private City districtCenter;
	private List<City> cities;
	private int districtSquare;

	public District() {
		super();
		cities = new ArrayList<>();
		districtCenter = new City();
	}

	public District(String name, int districtSquare) {
		this();
		this.name = name;
		this.districtSquare = districtSquare;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<City> getCities() {
		return cities;
	}

	public void addCity(String name, long population, int districtSquare) {
		this.cities.add(new City(name, population, districtSquare));
	}

	public City getDistrictCenter() {
		return districtCenter;
	}

	public void setDistrictCenter(City city) {
		this.districtCenter = city;
	}

	public int getDistrictSquare() {
		return districtSquare;
	}

	public void setDistrictSquare(int districtSquare) {
		this.districtSquare = districtSquare;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((districtCenter == null) ? 0 : districtCenter.hashCode());
		result = prime * result + districtSquare;
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
		District other = (District) obj;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (districtCenter == null) {
			if (other.districtCenter != null)
				return false;
		} else if (!districtCenter.equals(other.districtCenter))
			return false;
		if (districtSquare != other.districtSquare)
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
		return "Region [name=" + name + ", districtCenter=" + districtCenter + "]";
	}

}
