import java.util.Scanner;

public class BiggestNumMethod {

    static long biggestNumber(long number){
        int maxDigit = 0;

        while (number != 0){
            int digit = (int) (number % 10);
            if (digit > maxDigit){
                maxDigit = digit;
            }
            number = number / 10;
        }
        return maxDigit;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        long number = sc.nextLong();

        long largestDigit = biggestNumber(number);
        System.out.println("The largest number is " + largestDigit);


    }
}
