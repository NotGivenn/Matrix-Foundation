import java.util.Scanner;

public class ExerciseBMI {
        public static void main(String[] args) {

            //BMI (Body Mass Index) Exercise

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter your Weight in kg: ");
            float weightKg = sc.nextFloat();

            System.out.println("Enter your Height in cm: ");
            int heightCm = sc.nextInt();

            float heightM = (float) heightCm / 100;
//        System.out.println(heightM);

            float bmi = weightKg / (heightM * heightM);
//        System.out.println("Your BMI is: " + bmi);

            if (bmi < 18.5) {
                System.out.println("Your BMI is: " + bmi + " (Underweight)");
            } else if (bmi >= 18.5 && bmi < 25) {
                System.out.println("Your BMI is: " + bmi + " (Healthy/Normal Weight)");
            } else if (bmi >= 25 && bmi < 30) {
                System.out.println("Your BMI is: " + bmi + " (Overweight)");
            } else if (bmi >= 30) {
                System.out.println("Your BMI is: " + bmi + " (Obesity)");
            } else {
                System.out.println("Error, please try again");
            }

//        System.out.println("Your BMI is: " + bmi + "and this is ");


        }
    }


//BMI (Body Mass Index)
// • Daxil ediləcəklər scanner ilə: weightKg (float), heightCm (int və ya short).
//        • heightM = heightCm / 100.0 (burada type conversion vacibdir).
//        • Hesablayın: bmi = weightKg / (heightM * heightM).
//        • If/else: BMI kateqoriyası çıxarın:
//        • < 18.5 – Zəif çəkili
// • 18.5–24.9 – Normal
// • 25–29.9 – Artıq çəkili
// • >= 30 – Obez
// • Çıxış yəni konsolda çapa veriləcək: BMI: 23.41 (Normal)

