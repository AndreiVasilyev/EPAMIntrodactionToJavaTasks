package by.epamLearning.classes.agregationAndComposition.task5.logic;

import java.util.Comparator;

import by.epamLearning.classes.agregationAndComposition.task5.entity.Voucher;

public class ByDestinationComparator implements Comparator<Voucher> {

	@Override
	public int compare(Voucher o1, Voucher o2) {
		return o1.getDestination().compareTo(o2.getDestination());
	}

}
