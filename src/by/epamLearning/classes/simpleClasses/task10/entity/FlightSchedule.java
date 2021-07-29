package by.epamLearning.classes.simpleClasses.task10.entity;

import java.util.ArrayList;
import java.util.List;

public class FlightSchedule {

	private List<Airline> airlines;

	public FlightSchedule() {
		this.airlines=new ArrayList<>();
	}

	public FlightSchedule(List<Airline> airlines) {
		super();
		this.airlines = airlines;
	}

	public List<Airline> getAirlines() {
		return airlines;
	}

	public void setAirlines(List<Airline> airlines) {
		this.airlines = airlines;
	}

	public void addAirline(Airline airline) {
		airlines.add(airline);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((airlines == null) ? 0 : airlines.hashCode());
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
		FlightSchedule other = (FlightSchedule) obj;
		if (airlines == null) {
			if (other.airlines != null)
				return false;
		} else if (!airlines.equals(other.airlines))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FlightSchedule [airlines=" + airlines + "]";
	}

}
