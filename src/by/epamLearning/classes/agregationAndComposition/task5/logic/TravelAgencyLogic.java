package by.epamLearning.classes.agregationAndComposition.task5.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import by.epamLearning.classes.agregationAndComposition.task5.entity.Food;
import by.epamLearning.classes.agregationAndComposition.task5.entity.SearchCriteria;
import by.epamLearning.classes.agregationAndComposition.task5.entity.Transport;
import by.epamLearning.classes.agregationAndComposition.task5.entity.TravelAgency;
import by.epamLearning.classes.agregationAndComposition.task5.entity.Voucher;
import by.epamLearning.classes.agregationAndComposition.task5.entity.VoucherType;

public class TravelAgencyLogic {

	public List<Voucher> sortVouchers(TravelAgency travelAgency, Comparator<Voucher> comparator) {
		List<Voucher> sortedVouchers = new ArrayList<>();
		if (travelAgency != null) {
			sortedVouchers.addAll(travelAgency.getVouchers());
			sortedVouchers.sort(comparator);
		}
		return sortedVouchers;
	}

	public List<Voucher> findVouchers(TravelAgency travelAgency, SearchCriteria searchCriteria) {
		List<Voucher> foundVouchers = new ArrayList<>();
		if (travelAgency != null) {
			VoucherType type;
			Food food;
			Transport transport;
			int days;			
			for (Voucher voucher : travelAgency.getVouchers()) {
				type = searchCriteria.getType();
				if (type == null || type.equals(voucher.getType())) {
					food = searchCriteria.getFood();
					if (food == null || food.equals(voucher.getFood())) {
						transport = searchCriteria.getTransport();
						if (transport == null || transport.equals(voucher.getTransport())) {
							days = searchCriteria.getDays();
							if (days == 0 || days >= voucher.getDaysQuantity()) {
								foundVouchers.add(voucher);
							}
						}
					}
				}

			}
		}
		return foundVouchers;
	}
}
