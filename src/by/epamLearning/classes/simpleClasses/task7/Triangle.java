package by.epamLearning.classes.simpleClasses.task7;

public class Triangle {

	private int sideA;
	private int sideB;
	private int sideC;

	private Triangle(int sideA, int sideB, int sideC) {
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public static Triangle create(int sideA, int sideB, int sideC) {
		if (sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA)
			return new Triangle(sideA, sideB, sideC);
		else
			return null;
	}

	public double calculatePerimetr() {
		return sideA + sideB + sideC;
	}

	public double calculateSquare() {
		double halfPerimetr = calculatePerimetr() / 2;		
		return Math.sqrt(halfPerimetr * (halfPerimetr - sideA) * (halfPerimetr - sideB) * (halfPerimetr - sideC));
	}

	public double calculateMadianIntersectionPointFromSideA() {
		double medianLength = ((double)1 / 2) * Math.sqrt((2 * sideB * sideB) + (2 * sideC * sideC) - (sideA * sideA));
		return medianLength / 3;
	}

}
