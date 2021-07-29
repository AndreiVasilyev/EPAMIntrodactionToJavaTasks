package by.epamLearning.classes.simpleClasses.task4.entity;

import java.util.Date;

public class Train {

	private String destinationPoint;
	private int trainNumber;
	private Date departureTime;

	public Train() {
	}

	public Train(String destinationPoint, int trainNumber, Date departureTime) {
		super();
		this.destinationPoint = destinationPoint;
		this.trainNumber = trainNumber;
		this.departureTime = departureTime;
	}

	public String getDestinationPoint() {
		return destinationPoint;
	}

	public void setDestinationPoint(String destinationPoint) {
		this.destinationPoint = destinationPoint;
	}

	public int getTrainNumber() {
		return trainNumber;
	}

	public void setTrainNumber(int trainNumber) {
		this.trainNumber = trainNumber;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departureTime == null) ? 0 : departureTime.hashCode());
		result = prime * result + ((destinationPoint == null) ? 0 : destinationPoint.hashCode());
		result = prime * result + trainNumber;
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
		Train other = (Train) obj;
		if (departureTime == null) {
			if (other.departureTime != null)
				return false;
		} else if (!departureTime.equals(other.departureTime))
			return false;
		if (destinationPoint == null) {
			if (other.destinationPoint != null)
				return false;
		} else if (!destinationPoint.equals(other.destinationPoint))
			return false;
		if (trainNumber != other.trainNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Train [destinationPoint=" + destinationPoint + ", trainNumber=" + trainNumber + ", departureTime="
				+ departureTime + "]";
	}

}
