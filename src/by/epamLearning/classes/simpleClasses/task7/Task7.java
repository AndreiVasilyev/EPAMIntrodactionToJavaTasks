package by.epamLearning.classes.simpleClasses.task7;

public class Task7 {

	public static void main(String[] args) {
		Triangle triangle = Triangle.create(3, 4, 6);
		System.out.println("Triangle with sides (3,4,6):");
		System.out.println("Parimeter: " + triangle.calculatePerimetr());
		System.out.println("Square: " + triangle.calculateSquare());
		System.out.println("Median intersection point (length from sideA (=3)): "
				+ triangle.calculateMadianIntersectionPointFromSideA());
	}

}
