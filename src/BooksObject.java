public class BooksObject {
    public static void main(String[] args) {
        // Creating book objects
        Books b1 = new Books("Harry Potter", "J.K. Rowling", 21.9);
        Books b2 = new Books("Boomer's Bukecket List", "Susan Pethick", 16.9);
        Books b3 = new Books("A Thousand Boy Kisses", "Tillie Cole", 15.75);

        // Printing individual books
        b1.printDetails();
        b2.printDetails();
        b3.printDetails();

        // Optionally, using an array of books
        Books[] booksArray = {b1, b2, b3};
        System.out.println("\nAll books:");
        for (Books b : booksArray) {
            b.printDetails();
        }
    }
}