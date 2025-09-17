import java.util.Scanner;

public class PersonObject {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);

        Person[] people = new Person[2];

        for (int i = 0; i < people.length; i++) {
            people[i] = new Person();

            System.out.println("Enter Name: ");
            people[i].name = sc.nextLine();

            System.out.println("Enter Age: ");
            people[i].age = sc.nextInt();

            sc.nextLine();


        }

        for (int i = 0; i < people.length; i++) {
            people[i].printInfo();
        }



    }
}
