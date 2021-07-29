package by.epamLearning.basics.branching;

public class Task1 {

	public static void main(String[] args) {
		isTriangleExist(90, 90);
		isTriangleExist(90, 100);
		isTriangleExist(90, 100);
		isTriangleExist(90, 60);
		isTriangleExist(50, 90);
		isTriangleExist(45, 45);
		isTriangleExist(20, 30);
	}

	private static void isTriangleExist(int firstAngle, int secondAngle) {
		if ((180 - firstAngle - secondAngle) > 0) {
			System.out.println("Triangle exist!");
			if (firstAngle == 90 || secondAngle == 90 || (180 - firstAngle - secondAngle) == 90) {
				System.out.println("Triangle is right!");
			} else
				System.out.println("Triangle isn't right!");
		} else
			System.out.println("Triangle isn't exist!");
		System.out.println();
	}

}
