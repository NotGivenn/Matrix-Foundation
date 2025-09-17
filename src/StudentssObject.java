public class StudentssObject {


    public static void main(String[] args) {

        Studentss s1 = new Studentss("Vefa", 30);
        Studentss s2 = new Studentss("Maks", 35);

        s1.printStudentInfo();
        s2.printStudentInfo();

        Studentss[] students = {s1, s2, new Studentss("Aylin", 25)};
        System.out.println("\nAll students:");
        for (Studentss s : students) {
            s.printStudentInfo();


        }

    }

}