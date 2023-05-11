public class Cylinder {
    private double height;
    private Circle circle;
    Cylinder(Circle circle, double height){
        this.height = height;
        this.circle = circle;
    }
    public double getVolume(){
        return circle.getArea() * height;
    }    
    public void showVolume(){
        System.out.println("圆柱体的体积为：" + getVolume());
    }
    }

