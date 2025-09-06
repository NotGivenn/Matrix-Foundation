import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci numbers are: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }

//        int count = 0;
//        while (count < n) {
//            System.out.print(a + " ");
//            int next = a + b;
//            a= b;
//            b=next;
//            count++;
//        }



    }
}
