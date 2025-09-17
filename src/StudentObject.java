import java.util.Scanner;

public class StudentObject {
    static Student[] students = null;

    public static void registerStudents(Scanner sc) {
        System.out.print("How many students do you want to register? ");
        int n = sc.nextInt();
        students = new Student[n];

        for (int i = 0; i < n; i++) {
            students[i] = new Student();

            System.out.print("Enter name: ");
            students[i].name = sc.nextLine();

            System.out.print("Enter age: ");
            students[i].age = sc.nextInt();

            sc.nextLine();
        }

        System.out.println("Registration completed!");
    }

    public static void showStudents() {
        if (students == null) {
            System.out.println("No students registered yet.");
        } else {
            System.out.println("Registered students:");
            for (int i = 0; i < students.length; i++) {
                Student s = students[i];
                s.printInfo();
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean running = true;

        while(running) {
            System.out.println("\nMenu: ");
            System.out.println("1. Registration");
            System.out.println("2. Show all");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> registerStudents(sc);
                case 2 -> showStudents();
                case 3 -> {
                    System.out.println("Exiting program...");
                    running = false;
                }
                default -> System.out.println("Invalid choice! Try again.");

            }
        }




    }
}
