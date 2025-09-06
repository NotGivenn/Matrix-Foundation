import java.util.Scanner;

import static java.lang.Math.random;
import static java.lang.Math.subtractExact;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String name = "Narmin";
//        String surname = "Gozalova";
//        System.out.println(name + " " + surname);

//        int a = 34;
//        int b = 524;
//        System.out.println(a*b);

//        DOESN'T WORK
//        ctrl+alt+l       ctrl+D
//        int random = Math.random();
//        System.out.println(random);


//Data types povtorit

// float double       short int long         char K = 'A'      Google: data type java    geeksforgeeks.org


// When we use String, we can use sc.next() or sc.nextLine().
// next() - читает до первого пробела(до первой пустоты). Рекомендуется использовать
//nextLine() - читает без пробела. Иногда создает баг в программе.
// But when we use int, we use sc.nextInt()


//        System.out.println("Enter Name");
//        String name = sc.nextLine();
//        String surname = "Gozalova";
//        System.out.printf(name + " " + surname);


//        System.out.println("Enter first number: ");
//        double num1 = sc.nextInt();
//
//        System.out.println("Enter second number: ");
//        double num2 = sc.nextInt();
//
//        double sum = num1 + num2;
//        double diff = num1 - num2;
//        double mult = num1 * num2;
//        double div = num1 / num2;
//
//        System.out.println("The sum of numbers is: " + sum);
//        System.out.println("The difference of numbers is: " + diff);
//        System.out.println("The multiplication of numbers is: " + mult);
//        System.out.println("The division of numbers is: " + div);


//        System.out.println("Enter your Name: ");
//        String name = sc.nextLine();
//
//        System.out.println("Enter your Surname: ");
//        String surname = sc.nextLine();

// if we use nextLine() for Gender, it doesn't work,but if we use next() - it WORK(If we write everything AFTER age)
// and if we use "gender" BEFORE AGE - it works too

//        System.out.println("Enter your Gender: ");
//        String gender = sc.nextLine();
//
//        System.out.println("Enter your Age: ");
//        int age = sc.nextInt();
//
//        System.out.println("Hello, " + name + " " + surname + ". Your Age is: " + age + ", and you are " + gender);


// and - &&       or - ||
// == - value is equal
// <=     >=     >     <     !=     !smth

//   /t - tab    /n - line down

// switch(){case X: ;break; default:  ;}
// switch(){case X: result = " "; break;}

// a=a+1  --> a=a++   --> a +=1        a /= 10            a++   ++a


//        for (int i = 1; i <= 5; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println( );
//        }
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Salam");
//        }



//        boolean cont = true;
//        while (cont) {
//            System.out.println("""
//                    1. addition
//                    2. Multiplication
//                    3. Subtraction
//                    4. Division
//                    5. Exit
//                    """);
//            int menu = sc.nextInt();
//
//            System.out.println("Enter 1st number: ");
//            int num1 = sc.nextInt();
//
//            System.out.println("Enter 2nd number: ");
//            int num2 = sc.nextInt();

//            switch (menu) {
//                case 1:
//                    System.out.println(num1 + num2);
//                    break;
//                case 2:
//                    System.out.println(num1 * num2);
//                    break;
//                case 3:
//                    System.out.println(num1 - num2);
//                    break;
//                case 4:
//                    System.out.println(num1 / num2);
//                    break;
//                case 5:
//                    cont = false;
//                    break;
//                default:
//                    System.out.println("Invalid input");
//            }
//        }


    }
}



