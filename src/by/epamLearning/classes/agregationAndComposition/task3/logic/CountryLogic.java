package by.epamLearning.classes.agregationAndComposition.task3.logic;

import java.util.ArrayList;
import java.util.List;

import by.epamLearning.classes.agregationAndComposition.task3.entity.Country;
import by.epamLearning.classes.agregationAndComposition.task3.entity.District;
import by.epamLearning.classes.agregationAndComposition.task3.entity.Region;

public class CountryLogic {

	public int regionsQuantity(Country country) {
		return country.getRegions().size();
	}

	public int getSquare(Country country) {
		int square = 0;
		for (Region region : country.getRegions()) {
			for (District district : region.getDistricts()) {
				square += district.getDistrictSquare();
			}
		}
		return square;
	}

	public List<String> getRegionCenters(Country country) {
		List<String> regionCenters = new ArrayList<>();
		for (Region region : country.getRegions()) {
			regionCenters.add(region.getRegionCenter().getName());
		}
		return regionCenters;
	}
}
