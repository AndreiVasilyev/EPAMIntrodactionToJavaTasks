package by.epamLearning.basics.linePrograms;

public class Task6 {

	public static void main(String[] args) {
		System.out.println(isInhere(1, 3));
		System.out.println(isInhere(3, 3));
		System.out.println(isInhere(-1, 4));
		System.out.println(isInhere(-1, -1));
		System.out.println(isInhere(3, -2));
		System.out.println(isInhere(3, 1));
	}

	private static boolean isInhere(int x, int y) {
		return ((x >= -2 && x <= 2 && y >= -3 && y <= 4) || (x >= -4 && x <= 4 && y >= -3 && y <= 0)) ? true : false;
	}
}
