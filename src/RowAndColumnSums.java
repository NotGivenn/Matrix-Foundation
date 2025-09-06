import java.util.Arrays;
import java.util.Scanner;

public class RowAndColumnSums {
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

        for (int i = 0; i < rows; i++) {
            int sumRow = 0;
            for (int j = 0; j < columns; j++) {
                sumRow += array[i][j];
            }
            System.out.println("The sum of row " + (i + 1) + " = " + sumRow);
        }

        for (int j = 0; j < columns; j++) {
            int sumCol = 0;
            for (int i = 0; i < rows; i++) {
                sumCol += array[i][j];
            }
            System.out.println("Sum of column " + (j + 1) + " = " + sumCol);
        }


    }
}


//Sətirlərin cəmi
//Hər bir sətrin elementlərinin cəmini tapın və ekrana çap edin.
//Sutunların cəmi
//Hər bir sütunun elementlərinin cəmini tapın və ekrana çap edin.


//2D