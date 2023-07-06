public class CylindricalContainer extends Container {
    private double hieght,radius;

    public CylindricalContainer(double hieght, double radius) {
        this.hieght = hieght;
        this.radius = radius;
    }

    @Override
    public double volume() {
        return Math.PI*radius*radius*hieght;
    }
}
