import java.util.Scanner;

public class InfinityPr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Menu: ");
        System.out.println("""
                    1. Currency Converter
                    2. Body Mass Index (BMI)
                    3. Tax Calculator
                    4. Grade Calculator
                    5. Taxi Fee Calculator
                    6. Triangle Type Checker
                    """);


        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("You selected Currency Converter");
                break;
            case 2:
                System.out.println("You selected BMI Calculator");
                break;
            case 3:
                System.out.println("You selected Tax Calculator");
                break;
            case 4:
                System.out.println("You selected Grade Calculator");
                break;
            case 5:
                System.out.println("You selected Taxi Fee Calculator");
                break;
            case 6:
                System.out.println("You selected Triangle Type Checker");
                break;
            default:
                System.out.println("Wrong choice!");
        }


    }
}






//Proqram run olarkəm istifadəçidən menyu seçimi istəyir və seçilmiş əməliyyatı giriş dəyərlərini Scanner ilə oxuyub if/else şərtləri əsasında hesablayıb ekrana çıxarır. Hər bir əməliyyat uyğun data type seçimi və tip çevrilməsi tələb edir.
//Menyu
// 1. Valyuta çevirici
// 2. Bədən kütlə indeksi (BMI)
// 3. Vergi hesablayıcı
// 4. Qiymət/Grade kalkulyatoru
// 5. Taksi haqqı hesablayıcı
// 6. Üçbucaq növü təyini
