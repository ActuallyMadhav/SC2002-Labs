package Lab4;

import java.util.*;

public class Shape3DApp {
    public static void main(String[] args){
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Sphere(10));
        shapes.add(new Cuboid(50, 20, 15));
        shapes.add(new Pyramid(20, 25));

        double totalSA = 0;
        for(Shape shape : shapes){
            totalSA += shape.calculateSurfaceArea();
        }

        System.out.println("Total Surface Area of 3D shape = " + totalSA);
    }
}
