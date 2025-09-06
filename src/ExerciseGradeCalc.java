import java.util.Scanner;

public class ExerciseGradeCalc {
    public static void main(String[] args) {

        //Score/Grade Calculator

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the score of a student(0-100): ");
        int score = sc.nextInt();
//        System.out.println(score);

        if (score > 100 || score < 0) {
            System.out.println("The score is greater than 100 or smaller than 0. Please try again.");
        } else if (score <= 100 && score > 90) {
            System.out.println("Your score is " + score + ", that means your grade is A");
        } else if (score <= 90 && score > 80) {
            System.out.println("Your score is " + score + ", that means your grade is B");
        } else if (score <= 80 && score > 70) {
            System.out.println("Your score is " + score + ", that means your grade is C");
        } else if (score <= 70 && score > 60) {
            System.out.println("Your score is " + score + ", that means your grade is D");
        } else if (score < 60) {
            System.out.println("Your score is " + score + ", that means your grade is F");
        }


    }
}


//Qiymət/Grade kalkulyatoru
// • Giriş(input) yəni scanner ilə dacil ediləcək: score (int, 0–100).
//        • Şərt:
//        • 90–100 → A
// • 80–89 → B
// • 70–79 → C
// • 60–69 → D
// • <60 → F
// • Else halı: 0-dan kiçik və ya 100-dən böyük daxil edilərsə, xəta mesajı çıxsın.
//        • nümunə çıxış(output) consoleda çapa veriləcək: “Sizin qiymətiniz: B”