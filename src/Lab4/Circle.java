package Lab4;

public class Circle implements Shape{
    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.PI * this.radius;
    }

    @Override
    public double calculateSurfaceArea() {
        return 0;
    }
}
