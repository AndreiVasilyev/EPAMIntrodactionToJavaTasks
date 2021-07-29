package by.epamLearning.classes.simpleClasses.task4.logic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import by.epamLearning.classes.simpleClasses.task4.entity.Train;

public class TrainLogic {

	public List<Train> sortTrainsByNumber(List<Train> trains) {
		List<Train> sortedTrains = new ArrayList<>(trains);
		sortedTrains.sort(new Comparator<Train>() {
			@Override
			public int compare(Train o1, Train o2) {
				return o1.getTrainNumber() < o2.getTrainNumber() ? -1
						: o1.getTrainNumber() == o2.getTrainNumber() ? 0 : 1;
			}
		});
		return sortedTrains;
	}

	public List<Train> sortTrainsByDestinationPoint(List<Train> trains) {
		List<Train> sortedTrains = new ArrayList<>(trains);
		sortedTrains.sort(new Comparator<Train>() {
			@Override
			public int compare(Train o1, Train o2) {
				return o1.getDestinationPoint().equals(o2.getDestinationPoint())
						? o1.getDepartureTime().compareTo(o2.getDepartureTime())
						: o1.getDestinationPoint().compareTo(o2.getDestinationPoint());
			}
		});
		return sortedTrains;
	}

	public Train findTrainsByNumber(List<Train> trains) {
		Train train = new Train();
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter train number:");
		int trainNumber = scan.nextInt();
		Optional<Train> searchResult = trains.stream().filter(x -> x.getTrainNumber() == trainNumber).findFirst();
		if (searchResult.isPresent()) {
			train = searchResult.get();
		}
		scan.close();
		return train;
	}
}
