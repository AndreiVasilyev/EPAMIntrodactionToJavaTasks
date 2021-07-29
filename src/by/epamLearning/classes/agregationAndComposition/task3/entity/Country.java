package by.epamLearning.classes.agregationAndComposition.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Country {

	private String name;
	private City capital;
	private List<Region> regions;

	public Country() {
		super();
		capital = new City();
		regions = new ArrayList<>();
	}

	public Country(String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City getCapital() {
		return capital;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public Region getRegion(String name) {
		if (name != null && !name.isBlank()) {
			for (Region region : regions) {
				if (name.equalsIgnoreCase(region.getName())) {
					return region;
				}
			}
		}
		return null;
	}

	public void addRegion(String name) {
		this.regions.add(new Region(name));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((capital == null) ? 0 : capital.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
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
		Country other = (Country) obj;
		if (capital == null) {
			if (other.capital != null)
				return false;
		} else if (!capital.equals(other.capital))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", capital=" + capital + "]";
	}

}
