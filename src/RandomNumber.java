import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int num = (int)(Math.random() * 10) + 1;
        int attempts = 0;

        System.out.println(num);

        do {
            System.out.println("Guess the number(1-10): ");
            n = sc.nextInt();
            attempts++;

            if(n < num) {
                System.out.println("Too low!");
            } else if(n > num) {
                System.out.println("Too high!");
            }

        } while (n != num);

        System.out.println("Correct! The number is " + num);
        System.out.println("Attempts: " + attempts);


    }
}


//Proqram təsadüfi bir ədəd seçsin (1–10 arası). İstifadəçi do-while ilə təxmin etsin.
//Düz tapana qədər davam etsin, sonunda neçə cəhd etdiyini göstər.
//        (Random deye birsey var arasdirin onla tesadufi random eded elde ede bilersiz)