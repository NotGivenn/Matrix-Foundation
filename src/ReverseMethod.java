import java.util.Scanner;

public class ReverseMethod {

    static long reverse(long n) {
        long reversed = 0;
        while (n != 0) {
            long digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;

        }
        return reversed;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        long n = sc.nextLong();

        long reversedNumber = reverse(n);
        System.out.println("Reversed Number is: " + reversedNumber);
    }
}
