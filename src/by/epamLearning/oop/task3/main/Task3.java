package by.epamLearning.oop.task3.main;

import by.epamLearning.oop.task3.entity.Calendar;
import by.epamLearning.oop.task3.logic.CalendarLogic;
import by.epamLearning.oop.task3.view.CalendarView;

public class Task3 {

	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		CalendarLogic calendarLogic = new CalendarLogic();
		CalendarView calendarView = new CalendarView();
		calendarLogic.addDays(calendar, calendarLogic.createDay(calendar, "01-01-2021"),
				calendarLogic.createDay(calendar, "12-06-2021"));			
		calendarLogic.findDay(calendar, "01-01-2021").makeFreeDay("New Year");		
		calendarLogic.findDay(calendar, "02.01.2021").makeFreeDay("New Year vacation");
		calendarLogic.findDay(calendar, "19.02.2021").makeFreeDay("Sofi birthday");
		calendarView.printToConsole(calendar);	
	}
}
