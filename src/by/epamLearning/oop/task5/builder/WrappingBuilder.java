package by.epamLearning.oop.task5.builder;

import by.epamLearning.oop.task5.bean.Wrapping;

public interface WrappingBuilder {

	public void setMaterial(String material);

	public void setWrapingShape(String wrapingShape);

	public void setLockType(String lockType);

	public void setColor(String color);

	public void setImage(String image);

	public void setVolume(int volume);

	public void setPrice(int price);

	public Wrapping getResult();
}
