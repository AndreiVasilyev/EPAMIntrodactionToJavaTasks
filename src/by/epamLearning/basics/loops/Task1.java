package by.epamLearning.basics.loops;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int value = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i <= value; i++)
			sum += i;
		System.out.println("Summ=" + sum);
		scanner.close();
	}

}
