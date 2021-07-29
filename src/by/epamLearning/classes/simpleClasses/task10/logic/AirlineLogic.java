package by.epamLearning.classes.simpleClasses.task10.logic;

import java.util.ArrayList;
import java.util.List;

import by.epamLearning.classes.simpleClasses.task10.entity.Airline;
import by.epamLearning.classes.simpleClasses.task10.entity.Time;

public class AirlineLogic {

	public List<Airline> findAirlinesByDestination(String destination, List<Airline> airlines) {
		List<Airline> foundAirlines = new ArrayList<>();
		for (Airline airline : airlines) {
			if (destination.equalsIgnoreCase(airline.getDestination())) {
				foundAirlines.add(airline);
			}
		}
		return foundAirlines;
	}

	public List<Airline> findAirlinesByDay(String day, List<Airline> airlines) {
		List<Airline> foundAirlines = new ArrayList<>();
		for (Airline airline : airlines) {
			if (day.equalsIgnoreCase(airline.getDay().toString())) {
				foundAirlines.add(airline);
			}
		}
		return foundAirlines;
	}

	public List<Airline> findAirlinesByDayAndTime(String day, Time time, List<Airline> airlines) {
		List<Airline> foundAirlines = new ArrayList<>();
		for (Airline airline : airlines) {
			if (day.equalsIgnoreCase(airline.getDay().toString())) {
				if (time.compareTo(airline.getDepartureTime()) < 0) {
					foundAirlines.add(airline);
				}
			}
		}
		return foundAirlines;
	}
}
