package by.epamLearning.oop.task5.builder;

import by.epamLearning.oop.task5.bean.Sweetness;

public interface SweetnessBuilder {

	public void setType(String type);

	public void setName(String name);

	public void setWeight(int weight);

	public void setFilling(String filling);

	public void setWrapping(String wrapping);

	public void setPrice(int price);
	
	public Sweetness getResult();
}
