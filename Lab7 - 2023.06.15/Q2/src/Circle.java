public class Circle extends Shape{
    private float r;
    private float area;

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        area= (float) 3.14*r*r;
    }

    @Override
    public void display() {
        System.out.println(area);
    }
}
