package by.epamLearning.classes.simpleClasses.task5;

public class Counter {

	private int value;
	private int minRange;
	private int maxRange;

	public Counter() {
		this.minRange = 0;
		this.maxRange = 10;
		this.value = this.minRange;
	}

	public Counter(int minRange, int maxRange) {
		this.minRange = minRange;
		this.maxRange = maxRange;
		this.value = this.minRange;
	}

	public int getValue() {
		return value;
	}

	public void increment() {
		if (value + 1 <= maxRange)
			value++;
	}

	public void decrement() {
		if (value - 1 >= minRange)
			value--;
	}
}
