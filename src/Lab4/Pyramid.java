package Lab4;

public class Pyramid implements Shape{
    private final double height;
    private final double base;

    public Pyramid(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateSurfaceArea() {
        double baseArea = this.base * this.base;
        double slant = Math.sqrt((base/2)*(base/2) + height*height);
        double triangleArea = 0.5 * base * slant;

        return 4*triangleArea + baseArea;
    }
}
