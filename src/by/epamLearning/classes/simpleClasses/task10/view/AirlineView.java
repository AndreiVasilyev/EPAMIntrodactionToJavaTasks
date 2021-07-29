package by.epamLearning.classes.simpleClasses.task10.view;

import java.util.List;

import by.epamLearning.classes.simpleClasses.task10.entity.Airline;

public class AirlineView {

	public void print(String message, List<Airline> airlines) {
		System.out.println("\n" + message + "\n");
		for (Airline airline : airlines) {
			print(airline);
		}
	}

	public void print(Airline airline) {
		System.out.printf("%-3d  %-10s  %-10s  %-10s  %-10s\n\n", airline.getFlightNumber(), airline.getDestination(),
				airline.getAircraftType(), airline.getDay().toString(), airline.getDepartureTime());

	}
}
