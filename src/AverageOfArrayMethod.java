import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArrayMethod {

    static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    static double averageArray(int[] array) {
        if (array.length == 0) return 0;
        int sum = sumArray(array);
        double averagee = (double) sum / array.length;
        return averagee;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int k = sc.nextInt();
        int[] array = new int[k];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < k; i++) {
            array[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array));

        double average = averageArray(array);
        System.out.println("Average of array: " + average);


    }
}
