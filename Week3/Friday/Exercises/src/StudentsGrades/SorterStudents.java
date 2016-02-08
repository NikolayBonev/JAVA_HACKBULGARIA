package StudentsGrades;

import java.util.*;

public class SorterStudents {
	public static void sortByGrade(List<Student> students){
		Collections.sort(students, new ComparatorStudents());
	}
}
