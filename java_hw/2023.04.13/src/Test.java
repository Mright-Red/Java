public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        circle.show();
    
        Cylinder cylinder = new Cylinder(circle, 10);
        cylinder.showVolume();
        }
    }

