package Abstract;


abstract class Shape {
    abstract double area();
    abstract double perimeter();

    public void display() {
        System.out.println("Bu bir şekildir.");
    }
}


class Rectangle extends Shape {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double area() {
        return width * height;
    }

    @Override
    double perimeter() {
        return 2 * (width + height);
    }
}


class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
}


