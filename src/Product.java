public class Product {

    public int id;
    public String name;
    public double price;


    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

        public double getPrice() {
        return price;
    }


    public void printProductInfo() {
        System.out.println("ID: " + id + "\n Name: " + name + "\n  Price: " + price + " manat");
    }
}