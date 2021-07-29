package by.epamLearning.classes.simpleClasses.task10.main;

import by.epamLearning.classes.simpleClasses.task10.entity.Airline;
import by.epamLearning.classes.simpleClasses.task10.entity.Day;
import by.epamLearning.classes.simpleClasses.task10.entity.FlightSchedule;
import by.epamLearning.classes.simpleClasses.task10.entity.Time;
import by.epamLearning.classes.simpleClasses.task10.logic.AirlineLogic;
import by.epamLearning.classes.simpleClasses.task10.view.AirlineView;

public class Task10 {

	public static void main(String[] args) {
		FlightSchedule flightSchedule = new FlightSchedule();
		AirlineLogic airlineLogic = new AirlineLogic();
		AirlineView airlineView = new AirlineView();
		flightSchedule.addAirline(new Airline(1, "Prague", "Boieng", new Time(12, 30, 00), Day.FRIDAY));
		flightSchedule.addAirline(new Airline(2, "Minsk", "Airbus", new Time(2, 30, 00), Day.SATURDAY));
		flightSchedule.addAirline(new Airline(3, "Moskow", "Boieng", new Time(11, 00, 00), Day.SUNDAY));
		flightSchedule.addAirline(new Airline(4, "Kiiv", "Airbus", new Time(5, 00, 00), Day.THURSDAY));
		flightSchedule.addAirline(new Airline(5, "Vilnus", "Airbus", new Time(6, 40, 00), Day.TUESDAY));
		flightSchedule.addAirline(new Airline(6, "Riga", "Boieng", new Time(15, 30, 00), Day.WEDNESDAY));
		flightSchedule.addAirline(new Airline(7, "Hamburg", "Airbus", new Time(18, 20, 00), Day.MONDAY));
		flightSchedule.addAirline(new Airline(8, "Minsk", "Airbus", new Time(20, 30, 00), Day.MONDAY));
		flightSchedule.addAirline(new Airline(9, "Kiiv", "Boieng", new Time(22, 15, 00), Day.FRIDAY));
		flightSchedule.addAirline(new Airline(10, "Prague", "Airbus", new Time(7, 10, 00), Day.SUNDAY));
		airlineView.print("All airlanes: ", flightSchedule.getAirlines());
		airlineView.print("Airlenes to Minsk:",
				airlineLogic.findAirlinesByDestination("minsk", flightSchedule.getAirlines()));
		airlineView.print("Airlenes in Sunday:",
				airlineLogic.findAirlinesByDay("sunday", flightSchedule.getAirlines()));
		airlineView.print("Airlenes in Friday after 15-00 :",
				airlineLogic.findAirlinesByDayAndTime("friday", new Time(15, 00, 00), flightSchedule.getAirlines()));
	}

}
