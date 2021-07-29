package by.epamLearning.classes.simpleClasses.task6;

import by.epamLearning.classes.simpleClasses.task10.entity.Time;

public class Task6 {

	public static void main(String[] args) {
		Time time = new Time();
		System.out.println(time);
		time.changeHoursOn(5);
		System.out.println(time);
		time.changeHoursOn(22);
		System.out.println(time);
		time.changeHoursOn(-2);
		time.changeMinutesOn(10);
		System.out.println(time);
		time.changeMinutesOn(115);
		System.out.println(time);
		time.setTime(0, 0, 0);
		System.out.println(time);
		time.changeSecondsOn(-1);
		System.out.println(time);

	}
}
