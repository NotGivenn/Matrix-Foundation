import java.util.Arrays;
import java.util.Scanner;

public class ChangeElementsArray {
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


        int first = array[0];
        int last = array[k - 1];

        array[0] = last;
        array[k - 1] = first;

        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(array[i] + " ");
        }


    }
}


//ilk elementle son elementin yerlerini deyismek

