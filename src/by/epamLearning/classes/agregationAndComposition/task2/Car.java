package by.epamLearning.classes.agregationAndComposition.task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {

	private String producer;
	private String model;
	private List<Wheel> wheels;
	private Engine engine;

	public Car() {
		this.wheels = new ArrayList<>(Arrays.asList(new Wheel(), new Wheel(), new Wheel(), new Wheel()));
		this.engine = new Engine();
	}

	public Car(String producer, String model) {
		this();
		this.producer = producer;
		this.model = model;
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

	public List<Wheel> getWheels() {
		return wheels;
	}

	public void setWheels(List<Wheel> wheels) {
		this.wheels = wheels;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
		result = prime * result + ((wheels == null) ? 0 : wheels.hashCode());
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
		Car other = (Car) obj;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		if (wheels == null) {
			if (other.wheels != null)
				return false;
		} else if (!wheels.equals(other.wheels))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Car [producer=" + producer + ", model=" + model + ", wheels=" + wheels + ", engine=" + engine + "]";
	}

	public void toDrive() {
		System.out.println("Car is driving...");
	}

	public void toRefuel() {
		System.out.println("Car is refueled...");
	}

	public void replaceWheel(int number) {
		if (number <= wheels.size()) {
			wheels.remove(number - 1);
			wheels.add(new Wheel());
			System.out.println("Wheel number " + number + " replaced...");
		}
	}

	public void printCarModel() {
		System.out.println("Car model: " + model);
	}

}
