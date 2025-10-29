package Lab4;

public class Sphere implements Shape{
    private final double radius;

    public Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateSurfaceArea() {
        return 4 * Math.PI * this.radius * this.radius;
    }
}
