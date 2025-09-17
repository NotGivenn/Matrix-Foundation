public class ProductObject {


    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 2200);
        Product p2 = new Product(2, "Smartphone", 800);
        Product p3 = new Product(3, "Tablet", 450);
        Product p4 = new Product(4, "Headphones", 150);
        Product p5 = new Product(5, "Monitor", 300);


        Product[] products = {p1, p2, p3, p4, p5};

        Product mostExpensive = products[0];

        for (int i = 0; i < products.length; i++) {
            Product p = products[i];

            if (p.getPrice() > mostExpensive.getPrice()) {
                mostExpensive = p;

            }
        }


        System.out.println("Most expensive product:");
        mostExpensive.printProductInfo();

    }
}