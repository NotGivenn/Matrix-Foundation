import java.util.Scanner;

public class MaxOfThreeMethod {

    static int max(int a, int b, int c) {
        int max;
        if (a > b && a > c) {
            max = a;
        } else if (b > c) {
            max = b;
        } else {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.print("Enter the third number: ");
        int c = sc.nextInt();

        int largest = max(a, b, c);
        System.out.println("The largest number is " + largest);


    }
}
