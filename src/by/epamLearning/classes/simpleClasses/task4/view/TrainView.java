package by.epamLearning.classes.simpleClasses.task4.view;

import java.util.List;

import by.epamLearning.classes.simpleClasses.task4.entity.Train;

public class TrainView {

	public void print(String message, List<Train> trains) {
		System.out.println("\n" + message + "\n");
		for (Train train : trains) {
			print(train);
		}
	}

	public void print(Train train) {
		if (train != null) {
			System.out.printf("%-4d %-15s %s\n", train.getTrainNumber(), train.getDestinationPoint(),
					train.getDepartureTime());
		}
	}
}
