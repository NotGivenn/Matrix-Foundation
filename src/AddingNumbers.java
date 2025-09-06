import java.util.Scanner;

public class AddingNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int sum = 0;

        do {
            System.out.println("Enter a number: ");
            n = sc.nextInt();
            sum += n;
        } while (sum < 30);

        if (sum == 30) {
            System.out.println("OK, The sum is 30");
        } else {
            System.out.println("Not OK, The sum exceed 30, it is " + sum);
        }


    }
}


//istifadeciden davamli reqem daxil edilmesi teleb olunsun.
// Eded daxil edildikce toplansin eger ededlerin cemi 30u kecdise dayansin.
// 30un ozu olsa cem OK cap olsunsun.