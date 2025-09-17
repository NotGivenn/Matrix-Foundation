public class RectangleObject {

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 10);
        Rectangle r2 = new Rectangle(3.5, 7.2);

        System.out.println("Rectangle 1 - Area: " + r1.area() + ", Perimeter: " + r1.perimeter());
        System.out.println("Rectangle 2 - Area: " + r2.area() + ", Perimeter: " + r2.perimeter());
    }

}
