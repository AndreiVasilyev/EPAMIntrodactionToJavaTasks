package by.epamLearning.classes.simpleClasses.task3.main;

import java.util.List;

import by.epamLearning.classes.simpleClasses.task3.entity.Group;
import by.epamLearning.classes.simpleClasses.task3.entity.Student;
import by.epamLearning.classes.simpleClasses.task3.logic.StudentLogic;
import by.epamLearning.classes.simpleClasses.task3.view.StudentView;

public class Task3 {

	public static void main(String[] args) {
		Group group = new Group();
		StudentLogic studentLogic = new StudentLogic();
		StudentView studentView = new StudentView();
		group.addStudent(new Student("Student 1", 1, List.of(6, 1, 4, 3, 4)));
		group.addStudent(new Student("Student 2", 2, List.of(10, 9, 5, 9, 7)));
		group.addStudent(new Student("Student 3", 4, List.of(6, 4, 5, 2, 8)));
		group.addStudent(new Student("Student 4", 2, List.of(10, 10, 9, 9, 10)));
		group.addStudent(new Student("Student 5", 3, List.of(10, 10, 10, 10, 8)));
		group.addStudent(new Student("Student 6", 1, List.of(9, 9, 9, 9, 9)));
		group.addStudent(new Student("Student 7", 5, List.of(7, 4, 5, 9, 9)));
		group.addStudent(new Student("Student 8", 4, List.of(7, 5, 8, 9, 2)));
		group.addStudent(new Student("Student 9", 3, List.of(4, 6, 9, 9, 8)));
		group.addStudent(new Student("Student 10", 5, List.of(10, 9, 10, 10, 9)));
		studentView.print("Excellent students:", studentLogic.findExcellentStudent(group.getStudents()));
	}

}
