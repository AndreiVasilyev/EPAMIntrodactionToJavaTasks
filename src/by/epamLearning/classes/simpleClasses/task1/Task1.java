package by.epamLearning.classes.simpleClasses.task1;

public class Task1 {

	public static void main(String[] args) {
		Test1 testClass = new Test1();
		testClass.setFirstValue(5);
		testClass.setSecondValue(7);
		testClass.showValues();
		System.out.println("sum=" + testClass.summOfValues());
		System.out.println("max value=" + testClass.maxValue());
	}

}
