public class Rectangle {
    int x , y , height , width ;
    public Rectangle(int x , int y , int width , int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public int getPerimeter() {
        return 2*(width + height);
    }
    public int getArea() {
        return width * height;
    }
    public void printInfo() {
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());
    }
}
