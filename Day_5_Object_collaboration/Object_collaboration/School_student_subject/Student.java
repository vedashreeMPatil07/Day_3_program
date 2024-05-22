public class Student {
    private String name ;
    private int rollNo;
    private Subject subject;
    private School school;
   
    
    public Student ()
    {

    }
    public Student(String name, int rollNo, Subject subject, School school) {
        this.name = name;
        this.rollNo = rollNo;
        this.subject = subject;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollNo=" + rollNo + ", subject=" + subject + ", school=" + school
                + "]";
    }
    
    
    
    
    
}
