import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");

        int n = sc.nextInt();


//        if (n < 0) {
//            System.out.println("Factorial is not defined for negative numbers.");
//        } else {
//            long factorial = 1;
//            for (int i = 1; i <= n; i++) {
//                factorial *= i;
//            }
//            System.out.println("Factorial of " + n + " is: " + factorial);
//        }



        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            long factorial = 1;

            System.out.print(n + "! = ");

            for (int i = 1; i <= n; i++) {
                factorial *= i;
                System.out.print(i);

                if( i < n ){
                    System.out.print("*");
                }
            }
            System.out.print(" = " + factorial);

            System.out.println("\nFactorial of " + n + " is: " + factorial);
        }



    }
}


//eded daxil edirsiniz onun faktorialini cixarsin