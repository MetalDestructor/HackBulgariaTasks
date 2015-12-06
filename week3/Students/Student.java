package Students;

public class Student {
	private String name;
	private int grade;

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}
	
	public Student(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
}
