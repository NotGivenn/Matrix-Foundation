import java.util.Scanner;

public class SymmetricPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number please: ");
        String number = sc.next();

        int len = number.length();
        int count = 0;

        System.out.println("Symmetric pairs: ");

        for (int i = 0; i < len / 2; i++) {
            if (number.charAt(i) == number.charAt(len - 1 - i)) {
                System.out.println(number.charAt(i) + " " + number.charAt(len - 1 - i));
                count++;
            }
        }
        if (len % 2 != 0) {
            char middle = number.charAt(len / 2);
            System.out.println("Middle digit: " + middle);
            count++;
        }

        System.out.println("Symmetry degree: " + count);

    }
}


//bonus task:
//Natural ədədin onluq yazılışında rəqəmləri eyni olan və
// bu ədədin onluq yazılışının mərkəzinə nəzərən simmetrik yerləşən cütlüklərin
// sayını həmin ədədin simmetriya dərəcəsi adlandıracağıq.
// Əgər ədəddə hər hansı rəqəm onluq yazılışda ortada yerləşirsə,
// onu da özü ilə bir cütlük kimi saymaq lazımdır.
// n ədədinin simmetriya dərəcəsini tapın.
//        input: 1235321
//output: 4