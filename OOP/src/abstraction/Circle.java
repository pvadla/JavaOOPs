package abstraction;

public class Circle extends Shape{

    int radius;



    public Circle(String color, int radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        System.out.println("Area of the square: "+ Math.PI *this.radius * this.radius);
        return Math.PI *this.radius * this.radius;


    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
