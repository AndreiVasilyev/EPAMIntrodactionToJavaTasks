package by.epamLearning.oop.task4.main;

import java.util.List;

import by.epamLearning.oop.task4.bean.Cave;
import by.epamLearning.oop.task4.bean.Treasure;
import by.epamLearning.oop.task4.exception.TreasureExceptionService;
import by.epamLearning.oop.task4.service.CaveLogic;
import by.epamLearning.oop.task4.service.ServiceProvider;
import by.epamLearning.oop.task4.service.TreasureService;
import by.epamLearning.oop.task4.view.TreasureView;

public class Task4 {

	private static final ServiceProvider serviceProvider = ServiceProvider.getInstance();

	public static void main(String[] args) {
		try {
			CaveLogic caveLogic = new CaveLogic();
			TreasureService treasureService = serviceProvider.getTreasureService();
			TreasureView treasureView = new TreasureView();
			treasureService.initRandomTreasureValues();
			Cave cave = new Cave(treasureService.getAllTreasures());
			treasureView.printTreasures("Random generated treasures: ", cave.getTreasures());

			Treasure treasure1 = new Treasure(33l, "test", 522);
			Treasure treasure2 = new Treasure(30l, "test2", 52342);
			Treasure treasure3 = new Treasure(45l, "test3", 7852);
			List<Treasure> treasures = List.of(treasure1, treasure2, treasure3);
			treasureService.saveTreasures(treasures);

			cave.setTreasures(treasureService.getAllTreasures());
			treasureView.printTreasures("Corrected treasures: ", cave.getTreasures());

			treasureView.printTreasure("The most expensive treasure: ", caveLogic.findMostExpensiveTreasure(cave));
			treasureView.printTreasuresCombinations("Treasures combinations for amount = 120",
					caveLogic.findTreasuresByAmount(cave, 120));
		} catch (TreasureExceptionService e) {
			System.out.println("There is occure exception:" + e.getMessage());
			e.printStackTrace();
		}
	}

}