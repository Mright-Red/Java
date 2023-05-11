public class App1 {
    public static void main(String[] args) throws Exception {
        Circle circle = new Circle(5);
        System.out.println("半径为：" + circle.radius);
        System.out.println("面积为：" + circle.getArea());
        System.out.println("周长为：" + circle.getCircumference());
        circle.radius = -1;
        try {
            circle.checkRadius();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        circle.radius = 0;
        try {
            circle.checkRadius();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
