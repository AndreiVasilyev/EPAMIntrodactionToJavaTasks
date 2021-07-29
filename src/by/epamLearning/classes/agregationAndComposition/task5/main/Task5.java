package by.epamLearning.classes.agregationAndComposition.task5.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import by.epamLearning.classes.agregationAndComposition.task5.entity.Food;
import by.epamLearning.classes.agregationAndComposition.task5.entity.SearchCriteria;
import by.epamLearning.classes.agregationAndComposition.task5.entity.Transport;
import by.epamLearning.classes.agregationAndComposition.task5.entity.TravelAgency;
import by.epamLearning.classes.agregationAndComposition.task5.entity.Voucher;
import by.epamLearning.classes.agregationAndComposition.task5.entity.VoucherType;
import by.epamLearning.classes.agregationAndComposition.task5.logic.ByCostComparator;
import by.epamLearning.classes.agregationAndComposition.task5.logic.ByDaysQuantityComparator;
import by.epamLearning.classes.agregationAndComposition.task5.logic.ByDestinationComparator;
import by.epamLearning.classes.agregationAndComposition.task5.logic.ByFoodComparator;
import by.epamLearning.classes.agregationAndComposition.task5.logic.ByTransportComarator;
import by.epamLearning.classes.agregationAndComposition.task5.logic.ByTypeComparator;
import by.epamLearning.classes.agregationAndComposition.task5.logic.TravelAgencyLogic;
import by.epamLearning.classes.agregationAndComposition.task5.view.TravelAgencyView;

public class Task5 {

	private final static int VOUCHERS_QUANTITY = 100;

	public static void main(String[] args) {
		List<Voucher> vouchers = createVouchers();
		TravelAgency agency = new TravelAgency(vouchers);
		TravelAgencyView agencyView = new TravelAgencyView();
		TravelAgencyLogic agencyLogic = new TravelAgencyLogic();
		agencyView.print("All vouchers:", agency.getVouchers());
		agencyView.print("Sorted by destination:", agencyLogic.sortVouchers(agency, new ByDestinationComparator()));
		agencyView.print("Sorted by type:", agencyLogic.sortVouchers(agency, new ByTypeComparator()));
		agencyView.print("Sorted by transport:", agencyLogic.sortVouchers(agency, new ByTransportComarator()));
		agencyView.print("Sorted by food:", agencyLogic.sortVouchers(agency, new ByFoodComparator()));
		agencyView.print("Sorted by days:", agencyLogic.sortVouchers(agency, new ByDaysQuantityComparator()));
		agencyView.print("Sorted by cost:", agencyLogic.sortVouchers(agency, new ByCostComparator()));
		SearchCriteria searchCriteria = new SearchCriteria();
		agencyView.print("Found vouchers without criteria:", agencyLogic.findVouchers(agency, searchCriteria));
		searchCriteria.setType(VoucherType.VACATION);
		agencyView.print("Found vouchers with criteria (VACATION):", agencyLogic.findVouchers(agency, searchCriteria));
		searchCriteria.setTransport(Transport.PLANE);
		agencyView.print("Found vouchers with criteria (VACATION, PLANE):", agencyLogic.findVouchers(agency, searchCriteria));
		searchCriteria.setFood(Food.ALL);
		agencyView.print("Found vouchers with criteria (VACATION, PLANE, ALL):", agencyLogic.findVouchers(agency, searchCriteria));
		searchCriteria.setFood(null);
		searchCriteria.setDays(10);
		agencyView.print("Found vouchers with criteria (VACATION, PLANE, 10 days):", agencyLogic.findVouchers(agency, searchCriteria));
	}

	private static List<Voucher> createVouchers() {
		Random rnd = new Random();
		List<Voucher> vouchers = new ArrayList<>();
		List<VoucherType> types = new ArrayList<>(Arrays.asList(VoucherType.values()));
		List<Food> foods = new ArrayList<>(Arrays.asList(Food.values()));
		List<Transport> transports = new ArrayList<>(Arrays.asList(Transport.values()));
		List<String> destinations = List.of("Turkey", "Egypt", "Bulgaria", "Montenegro", "Spain", "Ukrain", "Poland",
				"USA", "Canada", "Czech", "Georgia");
		for (int i = 0; i < VOUCHERS_QUANTITY; i++) {
			Voucher voucher = new Voucher();
			voucher.setDestination(destinations.get(rnd.nextInt(destinations.size())));
			voucher.setType(types.get(rnd.nextInt(types.size())));
			voucher.setFood(foods.get(rnd.nextInt(foods.size())));
			voucher.setTransport(transports.get(rnd.nextInt(transports.size())));
			voucher.setDaysQuantity(rnd.nextInt(26) + 5);
			voucher.setCost(voucher.getDaysQuantity() * ((rnd.nextInt(1900) + 100) / 100 * 100));
			vouchers.add(voucher);
		}
		return vouchers;
	}
}
