import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;

        int temp = Math.abs(number);
        while (temp > 0) {
            int digit = temp % 10;
//            System.out.println(digit);

            sum = sum + digit;
//            System.out.println(sum);

            temp = temp / 10;
//            System.out.println(temp);
        }

        System.out.println("Sum of digits = " + sum);
    }
}


//İstifadəçidən bir ədəd daxil et. While ilə bu ədədin rəqəmlərinin cəmini tap.
//        Məsələn: 1234 → 1+2+3+4=10