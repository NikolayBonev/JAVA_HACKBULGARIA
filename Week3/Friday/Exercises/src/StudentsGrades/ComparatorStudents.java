package StudentsGrades;

import java.util.Comparator;

public class ComparatorStudents implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getGrade() == o2.getGrade()){
			return o1.getName().compareTo(o2.getName());
		}
		
		return Integer.compare(o1.getGrade(), o2.getGrade());
	}

}
