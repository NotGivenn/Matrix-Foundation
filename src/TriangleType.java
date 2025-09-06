import java.util.Scanner;

public class TriangleType {
    public static void main(String[] args) {

        //Triangle Type

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Side a: ");
        int a = sc.nextInt();

        System.out.print("Enter Side b: ");
        int b = sc.nextInt();

        System.out.print("Enter Side c: ");
        int c = sc.nextInt();

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Error: Sides must be positive and must not be equal to 0");
            return;
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Error: these sides cannot form a triangle");
            return;
        }

        if (a == b && b == c) {
            System.out.println("Type is Equilateral(равносторонний) triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("Type is Isosceles(равнобедренный) triangle");
        } else {
            System.out.println("Type is Scalene(разносторонний) triangle");
        }


    }
}


//Üçbucaq növü
// • Giriş: 3 tərəf (int və ya short).
//        • Əvvəlcə şərtlər: əvvəl üçbucaq şərti (a+b>c və s.), sonrakı şərt isə
// • hamısı bərabər → bərabərtərəfli
// • ikisi bərabər → bərabəryanlı
// • heç biri bərabər deyil → müxtəliftərəfli
// • Səhv halda da xəta mesajı çapa verin