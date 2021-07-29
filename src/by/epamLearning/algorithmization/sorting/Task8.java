package by.epamLearning.algorithmization.sorting;

public class Task8 {

	public static void main(String[] args) {
		int[] p = { 3, 5, 8, 4, 3, 5, 8, 6 };
		int[] q = { 1, 4, 7, 2, 5, 8, 3, 4 };
		task8(p, q);
	}

	private static void task8(int[] p, int[] q) {
		printFraction(p, q);
		for (int i = 0; i < q.length - 1; i++) {
			if (q[i] == q[i + 1])
				continue;
			if (q[i] > q[i + 1] && q[i] % q[i + 1] == 0) {
				p[i + 1] *= q[i] / q[i + 1];
				q[i + 1] = q[i];

			} else {
				int factor;
				if (q[i + 1] % q[i] == 0) {
					factor = q[i + 1] / q[i];
				} else {
					factor = q[i + 1];
					p[i + 1] *= q[i];
					q[i + 1] *= q[i];
				}
				for (int j = i; j >= 0; j--) {
					p[j] *= factor;
					q[j] *= factor;
				}
			}
		}
		printFraction(p, q);
		int counter = 0;
		while (counter < p.length - 1) {
			if (p[counter] > p[counter + 1]) {
				int temp = p[counter];
				p[counter] = p[counter + 1];
				p[counter + 1] = temp;
				if (counter > 0)
					counter--;
				continue;
			}
			counter++;
		}
		printFraction(p, q);
	}

	private static void printFraction(int[] p, int[] q) {
		for (int i = 0; i < q.length; i++) {
			System.out.print(p[i] + "/" + q[i] + " ");
		}
		System.out.println("\n");
	}
}
