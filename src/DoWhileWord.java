import java.util.Scanner;

public class DoWhileWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String word;

        do {
            System.out.print("Enter the password: ");
            word = sc.next().toLowerCase();
        } while ( !word.equals("password"));

        System.out.println("Right Password is " + word);

    }
}

//Proqramda bir soz olsun (məsələn "java"). İstifadəçidən do-while ilə soz daxil etməsini istə.
// Düzgün soz yazılana qədər davam etsin. Düzgün olanda "OK" yazılsın.