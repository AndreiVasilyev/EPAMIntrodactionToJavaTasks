package by.epamLearning.basics.loops;

import java.math.BigInteger;

public class Task4 {

	public static void main(String[] args) {
		BigInteger mult = new BigInteger("1");
		for (int i = 2; i < 201; i++)
			mult = mult.multiply(new BigInteger(String.valueOf(i * i)));
		System.out.println("Mult=" + mult);
	}
}
