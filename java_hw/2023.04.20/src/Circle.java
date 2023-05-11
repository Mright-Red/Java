public class Circle implements ShapePara {
    public double radius;
    private double x;
    protected double y;

    public Circle(double radius) {
        this.radius = radius;
        this.x = 0;
        this.y = 0;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public int getArea() {
        return (int) (Math.PI * radius * radius);
    }

    @Override
    public int getCircumference() {
        return (int) (2 * Math.PI * radius);
    }
}

