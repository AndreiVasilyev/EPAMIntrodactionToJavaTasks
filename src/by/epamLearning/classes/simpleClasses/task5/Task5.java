package by.epamLearning.classes.simpleClasses.task5;

public class Task5 {

	public static void main(String[] args) {
		Counter counter = new Counter();
		System.out.println("Current value:" + counter.getValue());
		counter.decrement();
		System.out.println("Decrement min value:" + counter.getValue());
		counter.increment();
		counter.increment();
		System.out.println("Increment 2 times: " + counter.getValue());
		counter = new Counter(5, 7);
		System.out.println("Create new counter in range [5,7]: " + counter.getValue());
		counter.increment();
		counter.increment();
		counter.increment();
		counter.increment();
		System.out.println("Increment 4 times: " + counter.getValue());
		counter.decrement();
		System.out.println("Decrement value: " + counter.getValue());
	}
}
