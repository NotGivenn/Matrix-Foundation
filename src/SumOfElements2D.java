import java.util.Arrays;
import java.util.Scanner;

public class SumOfElements2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int columns = sc.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter " + rows * columns + " elements of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("The 2D array's sum is " + sum);

    }
}


//2D
//Verilən int[][] numbers arrayinde bütün elementlərin cəmini hesablayın.


