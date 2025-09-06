import java.util.Scanner;

public class SecondDigit {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number");
        int n = sc.nextInt();

//        System.out.println(n/10);
//        System.out.println(n%10);

        int secDigit = Math.abs(n) % 10;
        System.out.println("The second digit is: " + secDigit);



    }
}


//istifadeci eded daxil etsin ve o ededin 2ci reqemini tapin.