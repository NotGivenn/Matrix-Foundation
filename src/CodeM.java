import java.util.Scanner;

public class CodeM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(mult1(a, b) + "1");
        System.out.println(mult2(a, b) + "2");
        System.out.println(mult3(a, b) + "3");
        System.out.println(mult4(a, b) + "4");
        System.out.println(mult5(a, b) + "5");
        System.out.println(mult6(a, b) + "6");
        System.out.println(mult7(a, b) + "7");
    }

    // сложение
    public static int mult1(int a, int b) {
        if (a == 0 || b == 0) return 0;

        int result = 0;
        int absB = Math.abs(b);

        for (int i = 0; i < absB; i++) {
            result += a;
        }

        return b < 0 ? -result : result;
    }

    // рекурсия
    public static int mult2(int a, int b) {
        if (b == 0) return 0;
        if (b == 1) return a;
        if (b == -1) return -a;

        if (b > 0) {
            return a + mult2(a, b - 1);
        } else {
            return -mult2(a, -b);
        }
    }

    // битовые операции
    public static int mult3(int a, int b) {
        int result = 0;
        boolean negative = (a < 0) ^ (b < 0);

        int absA = Math.abs(a);
        int absB = Math.abs(b);

        while (absB > 0) {
            if ((absB & 1) == 1) {
                result += absA;
            }
            absA <<= 1;
            absB >>= 1;
        }

        return negative ? -result : result;
    }

    // exp(ln(a) + ln(b))
    public static int mult4(int a, int b) {
        if (a == 0 || b == 0) return 0;

        boolean negative = (a < 0) ^ (b < 0);
        double logResult = Math.log(Math.abs(a)) + Math.log(Math.abs(b));
        int result = (int) Math.round(Math.exp(logResult));

        return negative ? -result : result;
    }


    public static int mult5(int a, int b) {
        if (a == 0 || b == 0) return 0;

        boolean negative = (a < 0) ^ (b < 0);
        int absA = Math.abs(a);
        int absB = Math.abs(b);
        int result = 0;

        while (absB > 0) {
            if (absB % 2 == 1) {
                result += absA;
            }
            absA <<= 1;
            absB >>= 1;
        }

        return negative ? -result : result;
    }

    // (a + b)^2 - (a - b)^2 = 4ab
    public static int mult6(int a, int b) {
        int sum = a + b;
        int diff = a - b;
        return (int)((Math.pow(sum,2) - Math.pow(diff,2)) / 4);
    }

    // сложение с выбором меньшего множителя для цикла

    public static int mult7(int a, int b) {
        if (a == 0 || b == 0) return 0;
        if (a == 1) return b;
        if (b == 1) return a;
        if (a == -1) return -b;
        if (b == -1) return -a;


        int smaller = Math.abs(a) < Math.abs(b) ? Math.abs(a) : Math.abs(b);
        int larger = Math.abs(a) < Math.abs(b) ? Math.abs(b) : Math.abs(a);

        int result = 0;
        for (int i = 0; i < smaller; i++) {
            result += larger;
        }
        boolean negative = (a < 0) ^ (b < 0);
        return negative ? -result :result;

    }
}