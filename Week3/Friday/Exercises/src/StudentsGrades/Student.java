package StudentsGrades;

public class Student {
	private String name;
	private int grade;
	
	public Student(String name, int grade){
		setName(name);
		setGrade(grade);
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return this.grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
}
