import java.util.Arrays;
import java.util.Scanner;

public class CommonElementsArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the first array: ");
        int k = sc.nextInt();
        int[] array1 = new int[k];

        System.out.println("Enter the elements of the first array: ");
        for (int i = 0; i < k; i++) {
            array1[i] = sc.nextInt();
        }

        System.out.println("Enter the size of the second array: ");
        int l = sc.nextInt();
        int[] array2 = new int[l];

        System.out.println("Enter the elements of the second array: ");
        for (int i = 0; i < l; i++) {
            array2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));


        System.out.print("Common Elements in Arrays are: ");

        boolean hascommon = true;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < l; j++) {

                if (array1[i] == array2[j]) {
                    System.out.print(array1[i] + " ");
                    hascommon = false;
                    break;
                }
                }
            }
        if (hascommon) {
            System.out.println("Not Common Elements in Array");
        }

        }
    }


//iki tekrarlanmayan sirali elementli arrayler arasinda ortaq elementleri cixisa vermek.
//array1: 1 3 4 9 15
//array2: 2 3 5 9 14
//output: 3 9

