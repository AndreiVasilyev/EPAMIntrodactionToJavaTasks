package by.epamLearning.oop.task4.service;

import java.util.ArrayList;
import java.util.List;

import by.epamLearning.oop.task4.bean.Cave;
import by.epamLearning.oop.task4.bean.Treasure;

public class CaveLogic {

	private List<Treasure> sourceTreasures;
	private List<List<Treasure>> treasuresCombinations;
	private int maxCombinationAmount;

	public Treasure findMostExpensiveTreasure(Cave cave) {
		int maxPriceValue = Integer.MIN_VALUE;
		Treasure mostExpensiveTreasure = null;
		for (Treasure treasure : cave.getTreasures()) {
			if (maxPriceValue < treasure.getPrice()) {
				mostExpensiveTreasure = treasure;
				maxPriceValue = treasure.getPrice();
			}
		}
		return mostExpensiveTreasure;
	}

	public List<List<Treasure>> findTreasuresByAmount(Cave cave, int amount) {
		sourceTreasures = cave.getTreasures();
		treasuresCombinations = new ArrayList<>();
		maxCombinationAmount = Integer.MIN_VALUE;
		findTreasuresCombinations(0, amount, new ArrayList<Treasure>());
		return treasuresCombinations;
	}

	private void findTreasuresCombinations(int startIndex, int amount, List<Treasure> currentCombination) {
		int currentAmount = 0;
		for (Treasure treasure : currentCombination) {
			currentAmount += treasure.getPrice();
		}
		if (currentAmount > amount)
			return;
		for (int i = startIndex; i < sourceTreasures.size(); i++) {
			int trialAmount = currentAmount + sourceTreasures.get(i).getPrice();
			if (trialAmount > maxCombinationAmount && trialAmount <= amount) {
				maxCombinationAmount = trialAmount;
				treasuresCombinations.clear();
			}
			List<Treasure> newCombination = new ArrayList<>(List.copyOf(currentCombination));
			newCombination.add(sourceTreasures.get(i));
			if (trialAmount == maxCombinationAmount) {
				treasuresCombinations.add(newCombination);
			}
			if (trialAmount != amount) {
				findTreasuresCombinations(i + 1, amount, newCombination);
			}
		}
	}

}
