public class Methods {

    //1
    static void test() {
        System.out.println("Hello");
        System.out.println("Goodbye");
        System.out.println("HihiHaha");
    }

    //2
    static String getHello() {
        return "Hello";
    }

    // Non Static Method
    void test1() {
        System.out.println("Hello1");
        System.out.println("Goodbye1");
        System.out.println("HihiHaha1");
    }

    //4
    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
    }

    //5
    static void printStringArray(String[] array) {
        for (String element : array) {
            System.out.print(element + " ");
        }
    }

    //6
    static int topla(int a, int b) {
        int sum = a+b;
        return sum;
    }


    public static void main(String[] args) {

        //1
        test();
        test();

        //2
        String text = getHello();
        System.out.println(text);

        // Non Static Method
        Methods main = new Methods();
        main.test1();

        //4
        int[] array = {6, 7, 8, 9, 10};

        int[] array2 = {1, 2, 3, 4, 5};


        printArray(array);

        System.out.println();

        printArray(array2);

        //5
        String[] names = {"Nermin", "Sofiya", "Asiyat", "Fatime"};

        printStringArray(names);

        //6
        int sum = topla(5,8);
        System.out.println(topla(5,8));


    }
}
