public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        Rectangle rectangle = new Rectangle(2.0,3.0);
        Triangle triangle = new Triangle(4.0,3.0);
        System.out.println("Circle Area: "+circle.calculateArea());
        System.out.println("Circle perimeter: "+circle.calculatePerimeter());

        System.out.println("Rectangle Area: "+rectangle.calculateArea());
        System.out.println("Rectangle perimeter: "+rectangle.calculatePerimeter());

        System.out.println("Triangle Area: "+triangle.calculateArea());
        System.out.println("Triangle perimeter: "+triangle.calculatePerimeter());
    }
}

