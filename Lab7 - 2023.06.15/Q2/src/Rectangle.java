public class Rectangle extends Shape{
    private float a;
    private float b;
    private float area;

    public Rectangle(float a, float b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void calculateArea() {
        area=a*b;
    }

    @Override
    public void display() {
        System.out.println(a);
    }
}
