import java.util.Scanner;

public class TaxCalculator {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter monthly salary: ");
    double monthlySalary = sc.nextDouble();

    System.out.println("Is this resident?(true/false): ");
    boolean resident = sc.nextBoolean();

    double tax  =0;

    if (resident) {
        // 0–500 → 0
        // 500–2000 → 10% от 500
        // >2000 → 15% от суммы выше 2000
        if (monthlySalary <= 500) {
            tax = 0;
        } else if (monthlySalary <= 2000) {
            tax = (monthlySalary - 500) * 0.10;
        } else {
            tax = (1500 * 0.10) + (monthlySalary - 2000) * 0.15;
        }
    } else {
        tax = monthlySalary * 0.20;
    }

    double netSalary = monthlySalary - tax;

    System.out.println("Tax amount: " + tax + " AZN");
    System.out.println("Net salary: " + netSalary + " AZN");


    }
}

//Vergi hesablayıcı
// • giriş yəni scanner ilə daxil olunasılar: monthlySalary (double), isResident (boolean) – “true/false” kimi oxuyun (və ya “bəli/xeyr” oxuyub boolean-a çevirin).
//        • Şərtlər:
//        • Əgər resident-dirsə:
//        • 0–500 → 0%
//        • 500–2000 → 10% yalnız 500-dən yuxarı hissəyə
// • >2000 → 15% yalnız 2000-dən yuxarı hissəyə + əvvəlkilər
// • non-resident: hamısına 20%.
//        • Çıxış: tutulacaq vergi və netSalary(net vergisiz maaş






