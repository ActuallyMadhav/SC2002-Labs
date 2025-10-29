package Lab4;

import java.util.*;

public class Shape2DApp {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(20, 25));
        shapes.add(new Triangle(50, 20));

        double totalArea = 0;
        for(Shape shape : shapes){
            totalArea += shape.calculateArea();
        }

        System.out.println("Total area of 2D figure = " + totalArea);
    }
}
