import java.util.Scanner;

public class UpperTriangleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.print("Enter size of square array: ");
//        int n = sc.nextInt();
//
//        int[][] array = new int[n][n];
//        int[][] array = new int[n][n];

        int[][] square = new int[4][4];

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[i].length; j++) {
                if(i<j){
                    square[i][j] = 1;

                } else if(i>j){
                    square[i][j] = 0;
                } else{
                    square[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square[0].length; j++) {
                System.out.print(square[i][j] + " ");
            }
            System.out.println();
        }






    }
}

//Çarpazdan aşağı 0, yuxarı 1 olsun (üst üçbucaq = 1, alt üçbucaq = 0)
// kvadrat olcusunde 2 olculu arrayed


//2D