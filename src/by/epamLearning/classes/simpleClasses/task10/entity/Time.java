package by.epamLearning.classes.simpleClasses.task10.entity;

public class Time implements Comparable<Time> {

	private final int MIN_RANGE = 0;
	private final int HOURS_RANGE = 24;
	private final int MINUTES_SECONDS_RANGE = 60;
	private int hours;
	private int minutes;
	private int seconds;

	public Time() {
		super();
		this.hours = 0;
		this.minutes = 0;
		this.minutes = 0;
	}

	public Time(int hours, int minutes, int seconds) {
		super();
		setTime(hours, minutes, seconds);
	}

	public void setHours(int hours) {
		this.hours = isHoursInRange(hours) ? hours : 0;
	}

	public void setMinutes(int minutes) {
		this.minutes = isMinutesInRange(minutes) ? minutes : 0;
	}

	public void setSeconds(int seconds) {
		this.seconds = isSecondsInRange(seconds) ? seconds : 0;
	}

	public void setTime(int hours, int minutes, int seconds) {
		this.hours = isHoursInRange(hours) ? hours : 0;
		this.minutes = isMinutesInRange(minutes) ? minutes : 0;
		this.seconds = isSecondsInRange(seconds) ? seconds : 0;
	}

	public int getHours() {
		return hours;
	}

	public int getMinutes() {
		return minutes;
	}

	public int getSeconds() {
		return seconds;
	}

	public void changeHoursOn(int hoursQuantity) {
		if (hoursQuantity != 0) {
			hours = (hours + (hoursQuantity % HOURS_RANGE)) % HOURS_RANGE;
			if (hours < 0)
				hours += HOURS_RANGE;
		}
	}

	public void changeMinutesOn(int minutesQuantity) {
		int totalMinutes = minutes + minutesQuantity;
		changeHoursOn(totalMinutes / MINUTES_SECONDS_RANGE);
		minutes = totalMinutes % MINUTES_SECONDS_RANGE;
		if (minutes < 0) {
			minutes += MINUTES_SECONDS_RANGE;
			changeHoursOn(-1);
		}
	}

	public void changeSecondsOn(int secondsQuantity) {
		int totalSeconds = seconds + secondsQuantity;
		changeHoursOn(totalSeconds / (MINUTES_SECONDS_RANGE * MINUTES_SECONDS_RANGE));
		totalSeconds %= (MINUTES_SECONDS_RANGE * MINUTES_SECONDS_RANGE);
		changeMinutesOn(totalSeconds / MINUTES_SECONDS_RANGE);
		seconds = totalSeconds % MINUTES_SECONDS_RANGE;
		if (seconds < 0) {
			seconds += MINUTES_SECONDS_RANGE;
			changeMinutesOn(-1);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}

	@Override
	public int compareTo(Time o) {
		if (hours == o.getHours()) {
			if (minutes == o.getMinutes()) {
				if (seconds == o.getSeconds()) {
					return 0;
				} else {
					return seconds > o.getSeconds() ? 1 : -1;
				}
			} else {
				return minutes > o.getMinutes() ? 1 : -1;
			}
		} else {
			return hours > o.getHours() ? 1 : -1;
		}

	}

	public String toString() {
		return String.format("%02d:%02d:%02d", hours, minutes, seconds);
	}

	private boolean isHoursInRange(int hours) {
		return hours >= MIN_RANGE && hours < HOURS_RANGE;
	}

	private boolean isMinutesInRange(int minutes) {
		return minutes >= MIN_RANGE && minutes < MINUTES_SECONDS_RANGE;
	}

	private boolean isSecondsInRange(int seconds) {
		return seconds >= MIN_RANGE && seconds < MINUTES_SECONDS_RANGE;
	}

}
