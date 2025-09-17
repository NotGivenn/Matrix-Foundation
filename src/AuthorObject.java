public class AuthorObject {
    public static void main(String[] args) {

        Author a1 = new Author("J.K. Rowling");
        Author a2 = new Author("George Orwell");

        BookAut b1 = new BookAut("Harry Potter", a1);
        BookAut b2 = new BookAut("1984", a2);

        b1.printBookInfo();
        b2.printBookInfo();
    }
}