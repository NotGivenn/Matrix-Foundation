public class Car {


    private String model;
    private int year;
    private double price;

    // 1

    public Car(String model) {
        this.model = model;
        this.year = 0;
        this.price = 0.0;
    }


    // 2
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.price = 0.0;
    }


    // 3
    public Car(String model, int year, double price) {
        this.model = model;
        this.year = year;
        this.price = price;
    }



    public void printCarInfo() {
        System.out.println("Model: " + model + ", Year: " + year + ", Price: " + price + " manat");
    }
}
