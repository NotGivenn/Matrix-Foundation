import java.util.Scanner;

public class AverageElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int k = sc.nextInt();
        int[] array = new int[k];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < k; i++) {
            array[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += array[i];

        }

        int average = sum / k;
        System.out.println("The average of the elements of the array is: " + average);


    }
}


//arraydeki elementlerin ortalamasini tapmaq.
