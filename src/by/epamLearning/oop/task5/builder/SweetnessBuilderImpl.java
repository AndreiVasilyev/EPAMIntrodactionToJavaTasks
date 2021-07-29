package by.epamLearning.oop.task5.builder;

import by.epamLearning.oop.task5.bean.Sweetness;

public class SweetnessBuilderImpl implements SweetnessBuilder {

	private String type;
	private String name;
	private int weight;
	private String filling;
	private String wrapping;
	private int price;

	@Override
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public void setFilling(String filling) {
		this.filling = filling;
	}

	@Override
	public void setWrapping(String wrapping) {
		this.wrapping = wrapping;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public Sweetness getResult() {
		return new Sweetness(type, name, weight, filling, wrapping, price);
	}

}
