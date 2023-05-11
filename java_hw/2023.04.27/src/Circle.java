public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
        checkRadius();
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    void checkRadius() {
        if (radius <= 0) {
            throw new IllegalArgumentException("半径不能为0或负数");
        }
    }
}