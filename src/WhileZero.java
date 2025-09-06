import java.util.Scanner;

public class WhileZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;

        do {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            sum += n;

        } while (n != 0);

        System.out.println("The sum is " + sum);

    }
}


//İstifadəçidən do-while ilə ədədlər daxil et.
//İstifadəçi 0 daxil edəndə dövr dayansın və bütün daxil edilən ədədlərin cəmi göstərilsin.