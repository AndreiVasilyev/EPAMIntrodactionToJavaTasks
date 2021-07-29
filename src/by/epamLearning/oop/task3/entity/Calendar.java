package by.epamLearning.oop.task3.entity;

import java.util.Set;
import java.util.TreeSet;

public class Calendar {

	private Set<Day> days;

	public Calendar() {
		this.days = new TreeSet<Day>();
	}

	public Calendar(Set<Day> days) {
		super();
		this.days = days;
	}

	public Set<Day> getDays() {
		return days;
	}

	public void setDays(Set<Day> days) {
		this.days = days;
	}

	public void addDay(Day day) {
		days.add(day);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((days == null) ? 0 : days.hashCode());
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
		Calendar other = (Calendar) obj;
		if (days == null) {
			if (other.days != null)
				return false;
		} else if (!days.equals(other.days))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Calendar [days=" + days + "]";
	}

	public class Day implements Comparable<Day> {

		private int date;
		private Month month;
		private int year;
		private boolean isFreeDay;
		private String freeDayReason;

		public Day() {
		}

		public Day(int date, Month month, int year) {
			super();
			this.date = date;
			this.month = month;
			this.year = year;
		}

		public Day(int date, Month month, int year, boolean isFreeDay, String freeDayReason) {
			super();
			this.date = date;
			this.month = month;
			this.year = year;
			this.isFreeDay = isFreeDay;
			this.freeDayReason = freeDayReason;
		}

		public int getDate() {
			return date;
		}

		public void setDate(int date) {
			this.date = date;
		}

		public Month getMonth() {
			return month;
		}

		public void setMonth(Month month) {
			this.month = month;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			this.year = year;
		}

		public boolean isFreeDay() {
			return isFreeDay;
		}

		public void setFreeDay(boolean isFreeDay) {
			this.isFreeDay = isFreeDay;
		}

		public String getFreeDayReason() {
			return freeDayReason;
		}

		public void setFreeDayReason(String freeDayReason) {
			this.freeDayReason = freeDayReason;
		}

		public void makeFreeDay(String reason) {
			this.isFreeDay = true;
			this.freeDayReason = reason;
		}
		
		public void makeWorkDay() {
			this.isFreeDay = false;
			this.freeDayReason = "";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + date;
			result = prime * result + ((freeDayReason == null) ? 0 : freeDayReason.hashCode());
			result = prime * result + (isFreeDay ? 1231 : 1237);
			result = prime * result + ((month == null) ? 0 : month.hashCode());
			result = prime * result + year;
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
			Day other = (Day) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			if (date != other.date)
				return false;
			if (freeDayReason == null) {
				if (other.freeDayReason != null)
					return false;
			} else if (!freeDayReason.equals(other.freeDayReason))
				return false;
			if (isFreeDay != other.isFreeDay)
				return false;
			if (month != other.month)
				return false;
			if (year != other.year)
				return false;
			return true;
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return "Day [date=" + date + ", month=" + month + ", year=" + year + ", isFreeDay=" + isFreeDay
					+ ", freeDayReason=" + freeDayReason + "]";
		}

		@Override
		public int compareTo(Day o) {
			if (this.year == o.getYear()) {
				if (this.month.equals(o.getMonth())) {
					if (this.date == o.getDate()) {
						return 0;
					}
					return this.date > o.getDate() ? 1 : -1;
				}
				return this.month.compareTo(o.getMonth());
			}
			return this.year > o.getYear() ? 1 : -1;
		}
	}
}
