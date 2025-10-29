package Lab4;

public class Cuboid implements Shape{
    private final double length;
    private final double width;
    private final double height;

    public Cuboid(double length, double width, double height){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateSurfaceArea() {
        return 2 * (height*width + height*length + width*length);
    }
}
