package by.epamLearning.basics.loops;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int m = scan.nextInt();
		int n = scan.nextInt();
		for (int i = m; i <= n; i++) {
			System.out.println("Number:" + i);
			System.out.print("Dividers:");
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0)
					System.out.print(j + " ");
			}
			System.out.println();
		}
		scan.close();
	}
}
