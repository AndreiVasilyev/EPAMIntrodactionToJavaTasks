package by.epamLearning.oop.task4.view;

import java.util.List;

import by.epamLearning.oop.task4.bean.Treasure;

public class TreasureView {

	public void printTreasure(String message, Treasure treasure) {
		System.out.println("\n" + message + "\n");
		System.out.println("id:" + treasure.getId() + " name:" + treasure.getName() + " price:" + treasure.getPrice());
	}

	public void printTreasures(String message, List<Treasure> treasures) {
		System.out.println("\n" + message + "\n");
		for (Treasure treasure : treasures) {
			System.out.println(
					"id:" + treasure.getId() + " name:" + treasure.getName() + " price:" + treasure.getPrice());
		}
	}

	public void printTreasuresCombinations(String message, List<List<Treasure>> treasuresCombinations) {
		System.out.println("\n" + message + "\n");
		for (List<Treasure> combination : treasuresCombinations) {
			int currentAmount = 0;
			for (Treasure treasure : combination) {
				System.out.println(
						"id:" + treasure.getId() + " name:" + treasure.getName() + " price:" + treasure.getPrice());
				currentAmount += treasure.getPrice();
			}
			System.out.println("Total price: " + currentAmount + "\n");
		}
	}
}
