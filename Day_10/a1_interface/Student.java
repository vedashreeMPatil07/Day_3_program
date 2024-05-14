package a1_interface;

public class Student implements Trial {
private int rollNo;
private String name;


public Student() {
	super();
	// TODO Auto-generated constructor stub
}


public Student(int rollNo, String name) {
	super();
	this.rollNo = rollNo;
	this.name = name;
}


public int getRollNo() {
	return rollNo;
}


public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", name=" + name + "]";
}


@Override
public void Display_rollNo() {
System.out.println(rollNo);	
}


@Override
public void  Display_name() {
	System.out.println(name);
}


}
