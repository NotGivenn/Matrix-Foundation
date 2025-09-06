import java.util.Scanner;

public class OddNumbersSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();

        int sum = 0;

        System.out.print("Odd numbers are: ");
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println();

        System.out.println("The sum of odd numbers in the interval from " + a + " to " + b + " is " + sum);


    }

}


//Tək ədədlərin cəmi
//a-dan b-ə qədər intervalda tək ədədlərin cəmini hesablayın.
//        (arraye aid deyil sade dovr ile ede bilersiniz)
