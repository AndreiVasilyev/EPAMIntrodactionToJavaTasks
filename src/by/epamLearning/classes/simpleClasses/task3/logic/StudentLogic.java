package by.epamLearning.classes.simpleClasses.task3.logic;

import java.util.ArrayList;
import java.util.List;

import by.epamLearning.classes.simpleClasses.task3.entity.Student;

public class StudentLogic {

	public List<Student> findExcellentStudent(List<Student> students) {
		List<Student> excellentStudents = new ArrayList<>();
		for (Student student : students) {
			if (isExcellentStudent(student.getGradeSheet())) {
				excellentStudents.add(student);
			}
		}
		return excellentStudents;
	}

	private boolean isExcellentStudent(List<Integer> gradeSheet) {
		for (int grade : gradeSheet) {
			if (grade < 9)
				return false;
		}
		return true;
	}
}
