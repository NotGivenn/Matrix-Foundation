import java.util.Arrays;
import java.util.Scanner;

public class AddTwoToNonNegative {
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

        for (int i = 0; i < k; i++) {
            if (array[i] >= 0) {
                array[i] += 2;
            }

        }

        System.out.println("Modified array: " + Arrays.toString(array));


    }

}


//Tam ədədlər ardıcıllığı verilir(array ile).
//Ardıcıllığın hər bir mənfi olmayan elementini 2 vahid artırmalı(arrayde qalacaq).
