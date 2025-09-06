
import java.util.Scanner;

public class WhileInfinityPr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean cont = true;

        while (cont) {
            System.out.println("""
                    Menu: 
                    1. Currency Converter
                    2. Body Mass Index (BMI)
                    3. Tax Calculator
                    4. Grade Calculator
                    5. Taxi Fee Calculator
                    6. Triangle Type Checker
                    7. Multiplication Table
                    8. Fibonachi numbers
                    9. Numbers Sum
                    10. Stars
                    11. Exit
                    """);

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("You selected Currency Converter");
                    break;
                case 2:
                    System.out.println("You selected BMI Calculator");
                    break;
                case 3:
                    System.out.println("You selected Tax Calculator");
                    break;
                case 4:
                    System.out.println("You selected Grade Calculator");
                    break;
                case 5:
                    System.out.println("You selected Taxi Fee Calculator");
                    break;
                case 6:
                    System.out.println("You selected Triangle Type Checker");
                    break;
                case 7:
                    System.out.println("You selected Multiplication Table");
                    break;
                case 8:
                    System.out.println("You selected Fibonachi numbers");
                    break;
                case 9:
                    System.out.println("You selected Numbers Sum");
                    break;
                case 10:
                    System.out.println("You selected Stars");
                    break;
                case 11:
                    cont = false;
                    break;
                default:
                    System.out.println("Wrong choice!");
            }

        }


    }
}





