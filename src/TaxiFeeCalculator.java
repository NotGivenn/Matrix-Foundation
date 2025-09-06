import java.util.Scanner;

public class TaxiFeeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance: ");
        double distance = sc.nextDouble();

        System.out.println("Was it night?(true/false): ");
        boolean night = sc.nextBoolean();

        System.out.println("Enter your age: ");
        byte age =  sc.nextByte();


        double openingFee = 1.00;
        double perKm = 0.70;
        double nightExtra = 0.10;

        double cost = openingFee + (distance * perKm);

        if (night) {
            cost = cost + distance * nightExtra;
        }

        if (age < 12) {
            cost = cost * 0.5;
        } else if (age >= 65) {
            cost = cost * 0.7;
        }

        System.out.println("Taxi Fee is " + cost + " manat");


    }
}


//Taksi haqqı hesablayıcı
// • Giriş: distanceKm (double), night (boolean), age (byte).
//        • Tarif:
//        • Açılış: 1.00 AZN
// • Hər km: 0.70 AZN
// • Gecə isə km başına əlavə 0.10 AZN
// • Endirim: age < 12 → 50% endirim; age >= 65 → 30% endirim
// • Çıxış: yekun məbləğ.


