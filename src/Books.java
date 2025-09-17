public class Books {

    public String title;
    public String author;
    public double price;

    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);


    }

}