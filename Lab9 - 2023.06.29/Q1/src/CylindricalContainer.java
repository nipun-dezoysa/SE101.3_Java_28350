public class CylindricalContainer extends Container{
    private double height;
    private double radius;

    public CylindricalContainer(double height, double radius) {
        this.height = height;
        this.radius = radius;
    }

    @Override
    double volume() {
        return 3.14159*radius*radius*height;
    }
}
