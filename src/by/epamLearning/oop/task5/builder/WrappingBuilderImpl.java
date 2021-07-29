package by.epamLearning.oop.task5.builder;

import by.epamLearning.oop.task5.bean.Wrapping;

public class WrappingBuilderImpl implements WrappingBuilder {

	private String material;
	private String wrapingShape;
	private String lockType;
	private String color;
	private String image;
	private int volume;
	private int price;

	@Override
	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public void setWrapingShape(String wrapingShape) {
		this.wrapingShape = wrapingShape;
	}

	@Override
	public void setLockType(String lockType) {
		this.lockType = lockType;
	}

	@Override
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

	@Override
	public void setPrice(int price) {
		this.price = price;
	}
		
	@Override
	public Wrapping getResult() {
		return new Wrapping(material, wrapingShape, lockType, color, image, volume, price);
	}

}
