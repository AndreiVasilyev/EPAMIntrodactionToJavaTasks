package by.epamLearning.classes.simpleClasses.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private String surnameAndInitials;
	private int groupNumber;
	private List<Integer> gradeSheet;

	public Student() {
		gradeSheet = new ArrayList<Integer>();
	}

	public Student(String surnameAndInitials, int groupNumber, List<Integer> gradeSheet) {
		super();
		this.surnameAndInitials = surnameAndInitials;
		this.groupNumber = groupNumber;
		this.gradeSheet = gradeSheet;
	}

	public String getSurnameAndInitials() {
		return surnameAndInitials;
	}

	public void setSurnameAndInitials(String surnameAndInitials) {
		this.surnameAndInitials = surnameAndInitials;
	}

	public int getGroupNumber() {
		return groupNumber;
	}

	public void setGroupNumber(int groupNumber) {
		this.groupNumber = groupNumber;
	}

	public List<Integer> getGradeSheet() {
		return gradeSheet;
	}

	public void setGradeSheet(List<Integer> gradeSheet) {
		this.gradeSheet = gradeSheet;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((gradeSheet == null) ? 0 : gradeSheet.hashCode());
		result = prime * result + groupNumber;
		result = prime * result + ((surnameAndInitials == null) ? 0 : surnameAndInitials.hashCode());
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
		Student other = (Student) obj;
		if (gradeSheet == null) {
			if (other.gradeSheet != null)
				return false;
		} else if (!gradeSheet.equals(other.gradeSheet))
			return false;
		if (groupNumber != other.groupNumber)
			return false;
		if (surnameAndInitials == null) {
			if (other.surnameAndInitials != null)
				return false;
		} else if (!surnameAndInitials.equals(other.surnameAndInitials))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Student [surnameAndInitials=" + surnameAndInitials + ", groupNumber=" + groupNumber + ", gradeSheet="
				+ gradeSheet + "]";
	}

}
