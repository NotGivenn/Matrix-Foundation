
public class BookAut {
    public String title;
    public Author author;

    public BookAut(String title, Author author) {
        this.title = title;
        this.author = author;
    }


    public void printBookInfo() {
        System.out.println("Title: " + title + ", Author: " + author.getName());
    }
}