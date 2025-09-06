public class PerfectNumber {
    public static void main(String[] args) {





        System.out.println("Perfect numbers from 1 to 500:");

        for (int num = 1; num <= 500; num++) {
            int sum = 0;

            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }

            if (sum == num) {
                System.out.println(num);
            }
        }




        }
}


//0-dan 500-e qeder mukemmel ededleri cap edin.
//Mukemmel eded ozunden basqa bolenlerinin cemi ozone beraber olan ededdir.
//Numune 6(meselen bolenler 1 2 3 cem ise 6 edir)