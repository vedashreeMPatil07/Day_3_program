package comparable_interface_Task;

public class Student implements Comparable<Student> {

	private int marks;

	
	
	public Student(int marks) {
		this.marks = marks;
	}

	public int getMarks() {
		return marks;
	}


	@Override
	public String toString() {
		return "Student [marks=" + marks + ", getMarks()=" + getMarks() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int compareTo(Student other) {
return Integer.compare(this.marks, other.marks);		
	}

	
}
