package by.epamLearning.classes.simpleClasses.task4.main;

import java.util.GregorianCalendar;

import by.epamLearning.classes.simpleClasses.task4.entity.Depo;
import by.epamLearning.classes.simpleClasses.task4.entity.Train;
import by.epamLearning.classes.simpleClasses.task4.logic.TrainLogic;
import by.epamLearning.classes.simpleClasses.task4.view.TrainView;

public class Task4 {

	public static void main(String[] args) {
		Depo depo = new Depo();
		depo.addTrain(new Train("Minsk", 11, new GregorianCalendar(2021, 5, 19, 17, 0).getTime()));
		depo.addTrain(new Train("Kiiv", 4, new GregorianCalendar(2021, 5, 22, 18, 20).getTime()));
		depo.addTrain(new Train("Kiiv", 13, new GregorianCalendar(2021, 5, 21, 6, 30).getTime()));
		depo.addTrain(new Train("Prague", 2, new GregorianCalendar(2021, 5, 22, 10, 10).getTime()));
		depo.addTrain(new Train("Vilnus", 5, new GregorianCalendar(2021, 5, 23, 12, 0).getTime()));
		TrainLogic trainLogic = new TrainLogic();
		TrainView trainView = new TrainView();
		trainView.print("All trains", depo.getTrains());
		trainView.print("Sorted by number: ", trainLogic.sortTrainsByNumber(depo.getTrains()));
		trainView.print("Sorted by destination: ", trainLogic.sortTrainsByDestinationPoint(depo.getTrains()));
		trainView.print(trainLogic.findTrainsByNumber(depo.getTrains()));
	}
}
