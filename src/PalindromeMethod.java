import java.util.Scanner;

public class PalindromeMethod {

    static boolean isPalindrome(int number) {
        int original = number;
        int reverse = 0;

        while (number != 0) {
            int digit = number %10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return original == reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");

        } else{
            System.out.println(number + " is not a palindrome number.");
        }

    }
}
