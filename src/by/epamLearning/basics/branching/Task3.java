package by.epamLearning.basics.branching;

public class Task3 {

	public static void main(String[] args) {
		System.out.println(isOnOneStreghtLine(0, 0, 1, 1, 2, 2));
		System.out.println(isOnOneStreghtLine(0, 0, 1, 1, 1, 3));
		System.out.println(isOnOneStreghtLine(0, 0, 1, 1, 1, 3));

	}

	private static boolean isOnOneStreghtLine(int x1, int y1, int x2, int y2, int x3, int y3) {
		if ((y3 - y1) / (y2 - y1) == (x3 - x1) / (x2 - x1))
			return true;
		else
			return false;
	}
}
