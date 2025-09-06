import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n =  sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n>0) {
            int digit = n%10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reverse);

        if (original==reverse) {
            System.out.println("Palindrome");
        }  else {
            System.out.println("Not Palindrome");
        }


    }
}


//Palindrom yoxla:
//İstifadəçidən bir ədəd daxil et. While ilə yoxla ki, bu ədəd tərsinə oxunanda eyni qalırmı.
//Məsələn: 121 → polindrom, 123 → deyil.