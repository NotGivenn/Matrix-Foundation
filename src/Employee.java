public class Employee {

    public String name;
    public double salary;


    public Employee() {
        this.name = "Unknown";
        this.salary = 0;
    }


    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }



    public void printEmployeeInfo() {
        System.out.println("Name: " + name + ", Salary: " + salary + " manat");


    }

}