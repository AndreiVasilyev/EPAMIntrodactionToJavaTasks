package by.epamLearning.classes.simpleClasses.task3.view;

import java.util.List;

import by.epamLearning.classes.simpleClasses.task3.entity.Student;

public class StudentView {

	public void print(String message, List<Student> students) {
		System.out.println("\n" + message + "\n");
		for (Student student : students) {
			print(student);
		}
	}

	public void print(Student student) {
		if (student != null) {
			System.out.printf("%-15s group %d    ", student.getSurnameAndInitials(), student.getGroupNumber());
			for (Integer grade : student.getGradeSheet()) {
				System.out.printf("%2d ", grade);
			}
			System.out.println();
		}
	}
}
