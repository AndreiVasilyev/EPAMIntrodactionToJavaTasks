package by.epamLearning.classes.simpleClasses.task2;

public class Task2 {

	public static void main(String[] args) {
		Test2 testClass = new Test2();
		System.out.println("firstValue=" + testClass.getFirstValue() + ", secondValue=" + testClass.getSecondValue());
		testClass = new Test2(2, 4);
		System.out.println("firstValue=" + testClass.getFirstValue() + ", secondValue=" + testClass.getSecondValue());
		testClass.setFirstValue(10);
		testClass.setSecondValue(15);
		System.out.println("firstValue=" + testClass.getFirstValue() + ", secondValue=" + testClass.getSecondValue());

	}

}
