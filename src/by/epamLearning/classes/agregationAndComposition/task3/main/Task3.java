package by.epamLearning.classes.agregationAndComposition.task3.main;

import by.epamLearning.classes.agregationAndComposition.task3.entity.City;
import by.epamLearning.classes.agregationAndComposition.task3.entity.Country;
import by.epamLearning.classes.agregationAndComposition.task3.logic.CountryLogic;
import by.epamLearning.classes.agregationAndComposition.task3.view.CountryView;

public class Task3 {

	public static void main(String[] args) {
		Country country = new Country("Belarus");
		fillTestData(country);
		CountryLogic countryLogic = new CountryLogic();
		CountryView countryView = new CountryView();
		countryView.print("Country", country.getName());
		countryView.print("Region quantity", String.valueOf(countryLogic.regionsQuantity(country)));
		countryView.print("Square", String.valueOf(countryLogic.getSquare(country)));
		countryView.print("Region Centers", countryLogic.getRegionCenters(country));
	}

	public static void fillTestData(Country country) {
		country.getCapital().setName("Minsk");
		country.getCapital().setPopulation(2215452);
		country.getCapital().setSquare(150);
		country.addRegion("Minskaya");
		country.addRegion("Mogilevskaya");
		country.addRegion("Gronenskaya");
		country.addRegion("Brestskaya");
		country.addRegion("Gomelskaya");
		country.addRegion("Vitebskaya");
		country.getRegion("Minskaya").setRegionCenter(country.getCapital());
		country.getRegion("Minskaya").addDistrict("Minskiy", 210);
		country.getRegion("Minskaya").getDistrict("Minskiy").setDistrictCenter(country.getCapital());
		country.getRegion("Minskaya").addDistrict("Vileyskiy", 87);
		country.getRegion("Minskaya").getDistrict("Vileyskiy").setDistrictCenter(new City("Vileyka", 45000, 25));
		country.getRegion("Minskaya").addDistrict("Borisovskiy", 82);
		country.getRegion("Minskaya").getDistrict("Borisovskiy").setDistrictCenter(new City("Borisov", 54000, 37));
		country.getRegion("Minskaya").addDistrict("Slutskiy", 104);
		country.getRegion("Minskaya").getDistrict("Slutskiy").setDistrictCenter(new City("Slutsk", 62000, 41));
		country.getRegion("Mogilevskaya").setRegionCenter(new City("Mogilev", 540000, 112));
		country.getRegion("Mogilevskaya").addDistrict("Mogilevskiy", 210);
		country.getRegion("Mogilevskaya").getDistrict("Mogilevskiy")
				.setDistrictCenter(country.getRegion("Mogilevskaya").getRegionCenter());
		country.getRegion("Mogilevskaya").addDistrict("Bobruiskiy", 87);
		country.getRegion("Mogilevskaya").getDistrict("Bobruiskiy").setDistrictCenter(new City("Bobruisk", 320000, 57));
		country.getRegion("Mogilevskaya").addDistrict("Kirovskiy", 82);
		country.getRegion("Mogilevskaya").getDistrict("Kirovskiy").setDistrictCenter(new City("Kirovsk", 25000, 21));
		country.getRegion("Mogilevskaya").addDistrict("Rogochevskiy", 104);
		country.getRegion("Mogilevskaya").getDistrict("Rogochevskiy")
				.setDistrictCenter(new City("Rogachev", 36000, 41));
	}

}
