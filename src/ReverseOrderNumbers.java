import java.util.Scanner;

public class ReverseOrderNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println("Result is: ");
        while (n >= 1) {
            System.out.print(n + " ");
            n--;
        }

    }
}


//İstifadəçidən bir ədəd al (n). While dövrü ilə n-dən 1-ə qədər bütün ədədləri tərsinə çap et.
//        Məsələn: n=5 → 5 4 3 2 1