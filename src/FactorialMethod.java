import java.util.Scanner;

public class FactorialMethod {


    static long factorial(long n){
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        long result = factorial(n);

        System.out.println("Factorial of " + n + " is: " + result);


    }
}


