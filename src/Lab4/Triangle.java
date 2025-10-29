package Lab4;

public class Triangle implements Shape{
    private double base;
    private double height;

    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * this.base * this.height;
    }

    @Override
    public double calculateSurfaceArea() {
        return 0;
    }
}
