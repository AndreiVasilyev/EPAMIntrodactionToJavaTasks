package by.epamLearning.classes.agregationAndComposition.task2;

public class Main {

	public static void main(String[] args) {
		Car car = new Car("Toyota", "RAV4");
		car.printCarModel();
		car.toDrive();
		car.toRefuel();
		car.toDrive();
		car.replaceWheel(2);
		car.toDrive();
	}

}
