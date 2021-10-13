package circle;
public class Circle {
    private double radius;
    private String color;
    Circle() {
        radius = 1;
        color = "red";
    }

    Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    protected double getArea() {
        return radius * radius * Math.PI;
    }
}
