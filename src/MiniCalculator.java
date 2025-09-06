import java.util.Scanner;

public class MiniCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean cont = true;

        while (cont) {
            System.out.println("""
                    1. addition
                    2. Multiplication
                    3. Subtraction
                    4. Division
                    5. Exit
                    """);

            int menu = sc.nextInt();

            System.out.println("Enter 1st number: ");
            int num1 = sc.nextInt();

            System.out.println("Enter 2nd number: ");
            int num2 = sc.nextInt();


            switch (menu) {
                case 1:
                    System.out.println(num1 + num2);
                    break;
                case 2:
                    System.out.println(num1 * num2);
                    break;
                case 3:
                    System.out.println(num1 - num2);
                    break;
                case 4:
                    System.out.println(num1 / num2);
                    break;
                case 5:
                    cont = false;
                    break;
                default:
                    System.out.println("Invalid input");

            }

        }
    }
}
