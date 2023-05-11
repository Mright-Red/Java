public class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(0, 0, 5, 5);
        Rectangle r2 = new Rectangle(3, 3, 5, 5);
        r1.printInfo();
        r2.printInfo();
        System.out.println(Position.getRelativePosition(r1, r2)); // Output: Inside
    }
}
