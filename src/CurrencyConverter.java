import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        double amount = sc.nextDouble();

        System.out.print("Which is converted from (AZN, USD, EUR): ");
        String from = sc.next().toUpperCase();

        System.out.print("Which is converted to (AZN, USD, EUR): ");
        String to = sc.next().toUpperCase();

//        double aznToUsd = 0.59;
//        double aznToEur = 0.51;
//        double usdToAzn = 1.70;
//        double usdToEur = 0.86;
//        double eurToAzn = 1.97;
//        double eurToUsd = 1.16;

        double result = 0;
        boolean valid = true;

        if (from.equals("AZN") && to.equals("USD")) {
            result = amount * 0.59;
        } else if (from.equals("AZN") && to.equals("EUR")) {
            result = amount * 0.51;
        } else if (from.equals("USD") && to.equals("AZN")) {
            result = amount * 1.70;
        } else if (from.equals("USD") && to.equals("EUR")) {
            result = amount * 0.86;
        } else if (from.equals("EUR") && to.equals("AZN")) {
            result = amount * 1.97;
        } else if (from.equals("EUR") && to.equals("USD")) {
            result = amount * 1.16;
        }

        if (valid) {
            System.out.println("Converted from " + amount + " " + from + " to " + to);
            System.out.println("Current value is " + result + " " + to);
        } else {
            System.out.println("ERROR");
        }

    }
}




//Valyuta çevirici
// • Giriş: amount (double), from və to (String, məsələn: “AZN”, “USD”, “EUR”).
//        • Şərt: Yalnız bu 3 valyuta dəstəklənsin. Dəstəklənməyən kod daxil olarsa, xəta mesajı verin.
//        • Məzənnələr (sabit verin; məsələn):
//        • 1 AZN = 0.59 USD, 1 AZN = 0.54 EUR
// • 1 USD = 1.70 AZN, 1 EUR = 1.85 AZN


