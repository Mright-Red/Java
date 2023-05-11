
public abstract class Shape {
    public abstract double getArea();

    public abstract double getPerimeter();
}

class Circle extends Shape {
    private double Radius;

    Circle(double Radius) {
        this.Radius = Radius;
    }

    public double getArea() {
        return Math.PI * Radius * Radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * Radius;
    }

    public String getCircumference() {
        return null;
    }

    public void setCenter(int i, int j) {
    }

    public void setRadius(int i) {
    }

    public String getRadius() {
        return null;
    }
}

class Rectangle extends Shape {
    private double Weight;
    private double Height;

    Rectangle(double Weight, double Height) {
        this.Weight = Weight;
        this.Height = Height;
    }

    public double getArea() {
        return Weight * Height;
    }

    public double getPerimeter() {
        return 2 * (Weight + Height);
    }
}