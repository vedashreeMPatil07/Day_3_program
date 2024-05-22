class Employee{
    private String name;
    private int age;


    public Employee()
    {
        /*The default constructor doesn't take any arguments and initializes the name and age variables
         to their default values (typically null for String and 0 for int).*/
    }
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        /*The parameterized constructor takes two arguments (name and age) and sets the name and age 
        variables of the Employee object to the values passed as arguments.

 */
    }
    public String getName() {
        return name;
        /*Returns the value of the name variable 
         * Getter methods are used to retrieve the values of private variables 
        */
    }
    public void setName(String name) {
        this.name = name;
        /*Sets the value of the name variable to the specified value passed as an argument.
         * setter methods are used to modify these variables.
         */
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


    @Override
    /*The toString() method is overridden in the Employee class: */
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
        /*This method returns a string representation of the Employee object, containing the values 
        of its member variables (name and age). When you call System.out.println(e), Java automatically invokes the toString() method of the Employee object e, which returns a string containing the employee's name and age, and prints it to the console. */
    }

    
}
