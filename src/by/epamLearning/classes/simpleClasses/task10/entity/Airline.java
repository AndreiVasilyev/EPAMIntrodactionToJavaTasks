package by.epamLearning.classes.simpleClasses.task10.entity;

public class Airline {

	private long flightNumber;
	private String destination;
	private String aircraftType;
	private Time departureTime;
	private Day day;

	public Airline() {
	}

	public Airline(long flightNumber, String destination, String aircraftType, Time departureTime, Day day) {
		super();
		this.flightNumber = flightNumber;
		this.destination = destination;
		this.aircraftType = aircraftType;
		this.departureTime = departureTime;
		this.day = day;
	}

	public long getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(long flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAircraftType() {
		return aircraftType;
	}

	public void setAircraftType(String aircraftType) {
		this.aircraftType = aircraftType;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public Day getDay() {
		return day;
	}

	public void setDay(Day day) {
		this.day = day;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((aircraftType == null) ? 0 : aircraftType.hashCode());
		result = prime * result + ((day == null) ? 0 : day.hashCode());
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + (int) (flightNumber ^ (flightNumber >>> 32));
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
		Airline other = (Airline) obj;
		if (aircraftType == null) {
			if (other.aircraftType != null)
				return false;
		} else if (!aircraftType.equals(other.aircraftType))
			return false;
		if (day != other.day)
			return false;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightNumber != other.flightNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Airline [flightNumber=" + flightNumber + ", destination=" + destination + ", aircraftType="
				+ aircraftType + ", departureTime=" + departureTime + ", day=" + day + "]";
	}

}
