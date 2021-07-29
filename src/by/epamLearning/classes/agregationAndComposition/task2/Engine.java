package by.epamLearning.classes.agregationAndComposition.task2;

public class Engine {

	private long idNumber;
	private String producer;
	private String model;
	private int power;

	public Engine() {
		super();
	}

	public Engine(long idNumber, String producer, String model, int power) {
		super();
		this.idNumber = idNumber;
		this.producer = producer;
		this.model = model;
		this.power = power;
	}

	public long getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(long idNumber) {
		this.idNumber = idNumber;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (idNumber ^ (idNumber >>> 32));
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + power;
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
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
		Engine other = (Engine) obj;
		if (idNumber != other.idNumber)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (power != other.power)
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Engine [idNumber=" + idNumber + ", producer=" + producer + ", model=" + model + ", power=" + power
				+ "]";
	}

}
