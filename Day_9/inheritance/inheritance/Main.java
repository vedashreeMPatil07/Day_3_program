package inheitance;

public class Main {
    public static void main(String[] args) {
        Employee employee =new Employee();
        Address address=(Employee)employee;
        Employee employee =(Address)address;
        address.showAdress();
        employee.showAdress();
    }
}
