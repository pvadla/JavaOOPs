package abstraction.usingabstractclass;

public class Rectangle extends Shape{

    int length;
    int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        System.out.println("Area of rectangle: "+ length * width);
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", color='" + color + '\'' +
                '}';
    }
}
