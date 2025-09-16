import java.util.Scanner;

public class LongestNumMethod {

    static int longestNumber(int a, int b) {
        int aCount = 0;
        int orjA = a;

        while (a > 0) {
            a /= 10;
            aCount++;
        }
        int bCount = 0;
        int orjB = b;


        while (b > 0) {
            b /= 10;
            bCount++;
        }

        if (aCount > bCount) {
            return orjA;
        } else if (bCount > aCount) {
            return orjB;
        } else {
            return -1;
        }


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        System.out.println(longestNumber(a, b));


    }
}
