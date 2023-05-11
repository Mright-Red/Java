
public class App {
    public static void main(String[] args) throws Exception {
        Shape circle = new Circle(2);
        Shape rectangle = new Rectangle(1, 2);

        double circleArea = Calculate.getArea(circle);
        double circlePerimeter = Calculate.getPerimeter(circle);
        double rectangleArea = Calculate.getArea(rectangle);
        double rectanglePerimeter = Calculate.getPerimeter(rectangle);

        System.out.println("Circle area: " + circleArea);
        System.out.println("Circle perimeter: " + circlePerimeter);
        System.out.println("Rectangle area: " + rectangleArea);
        System.out.println("Rectangle perimeter: " + rectanglePerimeter);

        Fish fish1 = new Fish("Nemo", 0);
        Fish fish2 = new Fish("Dory", 0);
        Tiger tiger1 = new Tiger("Simba", 4);
        Tiger tiger2 = new Tiger("Rajah", 4);
        SouthEastTiger tiger3 = new SouthEastTiger("Shere Khan", 4);

        System.out.println("Total animals: " + Animal.getCount());
        System.out.println("Total fish: " + Fish.getCount());
        System.out.println("Total tigers: " + Tiger.getCount());
        System.out.println("Total Southeast tigers: " + SouthEastTiger.getCount());



        Circle circle1 = new Circle(5);
        System.out.println("半径为：" + circle1.getRadius());
        System.out.println("面积为：" + circle1.getArea());
        System.out.println("周长为：" + circle1.getCircumference());
        circle1.setCenter(1, 2);
        circle1.setRadius(10);
        System.out.println("半径为：" + circle1.getRadius());
        System.out.println("面积为：" + circle1.getArea());
        System.out.println("周长为：" + circle1.getCircumference());
    }
}