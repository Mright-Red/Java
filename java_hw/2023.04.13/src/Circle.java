class Circle{
    private double Radius;
    Circle(){
        Radius = 0;
    }
    Circle(double r){
        Radius = r;
    }
    public double getArea(){    
        return (Math.PI * Radius * Radius);
    }
    public double getPerimeter(){    
        return (Math.PI * 2 * Radius);
    }
    public void show(){
        System.out.println("圆的半径为：" + Radius);
        System.out.println("圆的周长为：" + getPerimeter());
        System.out.println("圆的面积为：" + getArea());
    }
}