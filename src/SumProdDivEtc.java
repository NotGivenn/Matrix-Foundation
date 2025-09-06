import java.util.Scanner;

public class SumProdDivEtc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        int prod = 1;

        while(temp > 0){
            int digit = temp % 10;
            sum +=digit;
            prod *= digit;
            temp /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + prod);

        if (sum != 0) {
            double ratio = (double) prod / sum;   //отношение произведения к сумме
            System.out.println("Ratio of product to sum: " + ratio);
        } else {
            System.out.println("Cannot divide by zero (sum of digits is 0).");
        }




    }
}

//Ededin reqemlerinin ceminin hasiline nisbetini tapin.