package by.epamLearning.basics.branching;

public class Task4 {

	public static void main(String[] args) {
		System.out.println(isSuitableSize(3, 4, 2, 3, 5));
		System.out.println(isSuitableSize(3, 4, 2, 6, 5));
		System.out.println(isSuitableSize(3, 4, 3, 4, 5));

	}

	private static boolean isSuitableSize(int a, int b, int x, int y, int z) {
		if ((x < a && y < b) || (x < b && y < a) || (x < a && z < b) || (x < b && z < a) || (y < a && z < b)
				|| (y < b && z < a))
			return true;
		else
			return false;
	}

}
