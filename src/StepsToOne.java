import java.util.Scanner;

public class StepsToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        int n = sc.nextInt();

        int steps = 0;

//        int count = 0;
//
//        while (n != 1) {
//            if (n % 2 == 0) {
//                n = n / 2;
//            } else {
//                n = n + 1;
//            }
//            count++;
//        }
//
//        System.out.println("Number of steps: " + count);


        while (n != 1) {
            if (n % 2 == 0) {
                int next = n / 2;
                System.out.println(n + " -> even -> " + n + " / 2 = " + next);
                System.out.println();
                n  = next;
            } else {
                int next = n + 1;
                System.out.println(n + " -> odd -> " + n + " + 1 = " + next);
                System.out.println();
                n = next;
            }
            steps++;

        }

        System.out.println("Number of steps is: " + steps);

    }
}


//Çevrilmə
//Hər hansı bir natural n ədədini götürək.
// Onu növbəti şəkildə dəyişdirəcəyik:
// Əgər ədəd cütdürsə, onda onu 2-ə bölək, əgər təkdirsə ona 1 əlavə edək.
// Bir neçə belə dəyişmədən sonra həmişə 1 alacağıq.
// Məsələn, 11 ədədindən 12 ədədi alınır, sonra 6, 3, 4, 2 və sonda 1.
// Beləliklə, 11-dən 1 almaq üçün 6 dəyişiklik etmək lazımdır.
//Verilmiş natural ədədə görə 1 alınana qədər onun dəyişmələrinin sayını tapın.
// (input: 11 ; output: 6)

