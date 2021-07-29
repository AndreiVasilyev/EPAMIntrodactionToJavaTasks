package by.epamLearning.classes.simpleClasses.task1;

public class Test1 {

	int firstValue;
	int secondValue;

	void showValues() {
		System.out.println("firstValue = " + firstValue + ", secondValue = " + secondValue);
	}

	void setFirstValue(int value) {
		firstValue = value;
	}

	void setSecondValue(int value) {
		secondValue = value;
	}

	int summOfValues() {
		return firstValue + secondValue;
	}

	int maxValue() {
		return (firstValue >= secondValue) ? firstValue : secondValue;
	}
}
