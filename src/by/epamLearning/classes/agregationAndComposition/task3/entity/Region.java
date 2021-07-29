package by.epamLearning.classes.agregationAndComposition.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {

	private String name;
	private City regionCenter;
	private List<District> districts;

	public Region() {
		super();
		regionCenter = new City();
		districts = new ArrayList<>();
	}

	public Region(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(City city) {
		this.regionCenter = city;
	}

	public List<District> getDistricts() {
		return districts;
	}

	public District getDistrict(String name) {
		if (name != null && !name.isBlank()) {
			for (District district : districts) {
				if (name.equalsIgnoreCase(district.getName())) {
					return district;
				}
			}

		}
		return null;
	}

	public void addDistrict(String name, int districtSquare) {
		this.districts.add(new District(name, districtSquare));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((districts == null) ? 0 : districts.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regionCenter == null) ? 0 : regionCenter.hashCode());
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
		Region other = (Region) obj;
		if (districts == null) {
			if (other.districts != null)
				return false;
		} else if (!districts.equals(other.districts))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regionCenter == null) {
			if (other.regionCenter != null)
				return false;
		} else if (!regionCenter.equals(other.regionCenter))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Region [name=" + name + ", regionCenter=" + regionCenter + "]";
	}

}
