
public class School {
private String department;

public School()
{
    
}

public School(String department) {
    this.department = department;
}

public String getDepartment() {
    return department;
}

public void setDepartment(String department) {
    this.department = department;
}

@Override
public String toString() {
    return "School [department=" + department + "]";
}


    
}