package by.epamLearning.oop.task3.view;

import java.util.ArrayList;
import java.util.List;

import by.epamLearning.oop.task3.entity.Calendar;
import by.epamLearning.oop.task3.entity.Month;
import by.epamLearning.oop.task3.entity.Calendar.Day;

public class CalendarView {

	public void printToConsole(Calendar calendar) {
		Month currentMonth = Month.JANUARY;
		int currentYear = 0;
		int counter = 0;
		List<String> freeDays = new ArrayList<>();
		for (Day day : calendar.getDays()) {
			if (!day.getMonth().equals(currentMonth) || day.getYear() != currentYear) {
				currentMonth = day.getMonth();
				currentYear = day.getYear();
				if (!freeDays.isEmpty()) {
					String emptyLine=counter==0?"":"\n";
					System.out.println(emptyLine);
					for (String freeDay : freeDays) {
						System.out.println(freeDay);
					}
					freeDays.clear();
				}
				System.out.println("\n\n" + currentMonth.toString() + "  " + currentYear + "\n");
				counter = 0;
			}
			if (day.isFreeDay()) {
				System.err.printf("%3d", day.getDate());
				freeDays.add(day.getDate() + " - " + day.getFreeDayReason());
			} else {
				System.out.printf("%3d", day.getDate());
			}
			counter++;
			if (counter % 7 == 0) {
				System.out.println();
				counter = 0;
			}

		}
	}
}
