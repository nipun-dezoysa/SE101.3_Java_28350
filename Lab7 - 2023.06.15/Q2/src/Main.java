public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(4.00f);
        Rectangle rectangle = new Rectangle(2.00f,4.00f);
        circle.calculateArea();
        circle.display();

        rectangle.calculateArea();
        rectangle.display();
    }
}
