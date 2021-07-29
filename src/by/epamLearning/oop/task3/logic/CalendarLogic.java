package by.epamLearning.oop.task3.logic;

import java.util.GregorianCalendar;
import java.util.Set;

import by.epamLearning.oop.task3.entity.Calendar;
import by.epamLearning.oop.task3.entity.Month;
import by.epamLearning.oop.task3.entity.Calendar.Day;

public class CalendarLogic {

	public void addDays(Calendar calendar, Day startDay, Day endDay) {
		Set<Day> days = calendar.getDays();
		GregorianCalendar startRange = new GregorianCalendar(startDay.getYear(), startDay.getMonth().ordinal(),
				startDay.getDate());
		GregorianCalendar endRange = new GregorianCalendar(endDay.getYear(), endDay.getMonth().ordinal(),
				endDay.getDate());
		endRange.add(java.util.Calendar.DATE, 1);
		while (startRange.before(endRange)) {
			Day day = calendar.new Day();
			day.setDate(startRange.get(java.util.Calendar.DATE));
			day.setMonth(Month.values()[startRange.get(java.util.Calendar.MONTH)]);
			day.setYear(startRange.get(java.util.Calendar.YEAR));
			days.add(day);
			startRange.add(java.util.Calendar.DATE, 1);
		}
	}

	public void clear(Calendar calendar) {
		calendar.getDays().clear();
	}

	public Day findDay(Calendar calendar, Day day) {
		for (Day dayFromCalendar : calendar.getDays()) {
			if (day.getYear() == dayFromCalendar.getYear()) {
				if (day.getMonth().equals(dayFromCalendar.getMonth())) {
					if (day.getDate() == dayFromCalendar.getDate()) {
						return dayFromCalendar;
					}
				}
			}
		}
		return null;
	}

	public Day findDay(Calendar calendar, String day) {
		return findDay(calendar, createDay(calendar, day));
	}

	public Day createDay(Calendar calendar, String day) {
		String[] parsedDay = day.trim().split("[\\.,-]");
		Day newDay = calendar.new Day(Integer.valueOf(parsedDay[0]), Month.values()[Integer.valueOf(parsedDay[1])-1],
				Integer.valueOf(parsedDay[2]));		
		return newDay;
	}

}
