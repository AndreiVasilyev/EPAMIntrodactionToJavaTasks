package by.epamLearning.classes.agregationAndComposition.task5.view;

import java.util.List;

import by.epamLearning.classes.agregationAndComposition.task5.entity.Voucher;

public class TravelAgencyView {

	public void print(String message, List<Voucher> vouchers) {
		System.out.println("\n\t" + message + "\n");
		System.out.printf("%-15s%-13s%-15s%-5s%-6s%-10s", "DESTINATION", "TYPE", "TRANSPORT", "FOOD", "DAYS",
				"COST");
		System.out.println("\n--------------------------------------------------------------");
		for (Voucher voucher : vouchers) {
			System.out.printf("\n%-15s%-13s%-15s%-5s%-6d%-10d\n", voucher.getDestination(), voucher.getType(),
					voucher.getTransport(), voucher.getFood(), voucher.getDaysQuantity(), voucher.getCost());
		}
	}
}
