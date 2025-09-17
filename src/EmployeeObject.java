public class EmployeeObject {

    public static void main(String[] args) {


        Employee e1 = new Employee();

        Employee e2 = new Employee("Asiyat", 5000);
        Employee e3 = new Employee("Murad", 3500);


        e1.printEmployeeInfo();
        e2.printEmployeeInfo();
        e3.printEmployeeInfo();


    }
}