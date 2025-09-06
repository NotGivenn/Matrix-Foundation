import java.util.Arrays;
import java.util.Scanner;

public class PositiveDivBy6 {
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

        //[1, 2, 3,4, 5, 6] [i]=i max = 5


        int sum = 0;
        int count = 0;
        for (int i = 0; i < k; i++) {
            if (array[i] % 6 == 0) {
                sum += array[i];
                count++;
            }
        }

        System.out.println("The sum of the digits that divided to 6: " + sum);
        System.out.println("The count of the digits that divided to 6: " + count);



    }
}


//n sayda tam ədədlər üçün 6-ya tam (qalıqsız)
//bölünən müsbət ədədlərin cəmini və sayını tapın.
//(n - arrayin ölçüsüdü Scanner ile daxil edin daha sonra
// arraydeki elementleri ozunuz doldurun)