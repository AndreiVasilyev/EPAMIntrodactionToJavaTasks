package by.epamLearning.classes.simpleClasses.task3.entity;

import java.util.ArrayList;
import java.util.List;

public class Group {

	private List<Student> students;

	public Group() {
		students = new ArrayList<>();
	}

	public Group(List<Student> students) {
		super();
		this.students = students;
	}
		
	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public void addStudent(Student student) {
		students.add(student);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((students == null) ? 0 : students.hashCode());
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
		Group other = (Group) obj;
		if (students == null) {
			if (other.students != null)
				return false;
		} else if (!students.equals(other.students))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Group [students=" + students + "]";
	}
}
