package by.epamLearning.classes.agregationAndComposition.task5.logic;

import java.util.Comparator;

import by.epamLearning.classes.agregationAndComposition.task5.entity.Voucher;

public class ByCostComparator implements Comparator<Voucher> {

	@Override
	public int compare(Voucher o1, Voucher o2) {
		int difference = o1.getCost() - o2.getCost();
		return difference > 0 ? 1 : difference == 0 ? 0 : -1;
	}

}
