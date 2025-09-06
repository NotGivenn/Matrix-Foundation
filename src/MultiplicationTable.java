public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {        // i = 3 --> строки (первое число)
            for (int j = 1; j <= 10; j++) {    // j = 4 --> столбцы (второе число)
                System.out.print(j + "*" + i + "=" + (i * j) + "\t\t");
            }
            System.out.println();
        }

    }
}
