package by.epamLearning.classes.simpleClasses.task2;

public class Test2 {

	private int firstValue;
	private int secondValue;

	Test2() {
		this.firstValue = 5;
		this.secondValue = 7;
	}

	Test2(int firstValue, int secondValue) {
		this.firstValue = firstValue;
		this.secondValue = secondValue;
	}

	public int getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(int firstValue) {
		this.firstValue = firstValue;
	}

	public int getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(int secondValue) {
		this.secondValue = secondValue;
	}

}
