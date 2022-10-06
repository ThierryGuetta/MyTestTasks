package src.MyTests.ClassesAndMethods.Task1;

import java.util.ArrayList;

public class Shape {
    private double volume;

    public Shape(double volume) {
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public static void main(String[] args) {
        Box box1 = new Box(10000);
        box1.add(new Ball(10.2));
        box1.add(new Pyramid(20, 10));
        box1.add(new Cylinder(15.4, 6.7));
        box1.add(new Pyramid(20, 10));
        box1.add(new Cylinder(15.4, 6.7));
        box1.add(new Cylinder(15.4, 6.7));
    }
}

class Pyramid extends Shape {
    private double height;
    private double square;

    public Pyramid(double height, double square) {
        super(1 / 3 * height * square);
        this.height = height;
        this.square = square;
    }
}

class Box extends Shape {
    private ArrayList<Shape> box = new ArrayList<>();
    private double available;

    public Box(double available) {
        super(available);
        this.available = available;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {
            box.add(shape);
            available -= shape.getVolume();
            System.out.println("Фигура успешно добавлена. В коробке осталось " + available);
            return true;
        } else {
            System.out.println("В коробке нет места");
            return false;
        }
    }
}

class SolidOfRevolution extends Shape {
    private double radius;

    public SolidOfRevolution(double volume, double radius) {
        super(volume);
        this.radius = radius;
    }
}

class Cylinder extends SolidOfRevolution {
    private double height;
    private double radius;

    public Cylinder(double height, double radius) {
        super(Math.PI * (radius * radius) * height, radius);
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }
}

class Ball extends SolidOfRevolution {

    public Ball(double radius) {
        super(4.0 / 3.0 * Math.PI * Math.pow(radius, 3), radius);
    }
}
