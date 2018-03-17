public class Circle {
    private double radius;
    private double circumference;
    public Circle() {
        radius = 1.0;
        circumference=1.0;
    }
    public Circle(double r) {
        radius = r;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*radius*Math.PI;
    }
}
