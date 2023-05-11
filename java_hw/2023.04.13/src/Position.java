public class Position {
    public static String getRelativePosition(Rectangle r1, Rectangle r2) {
        if (r1.x + r1.width < r2.x || r2.x + r2.width < r1.x || r1.y + r1.height < r2.y || r2.y + r2.height < r1.y) {
            return "No intersection";
        } else if (r1.x + r1.width == r2.x || r2.x + r2.width == r1.x || r1.y + r1.height == r2.y || r2.y + r2.height == r1.y) {
            return "Touching";
        } else if (r1.x + r1.width < r2.x + r2.width && r1.y + r1.height < r2.y + r2.height) {
            return "Inside";
        } else if (r1.x > r2.x + r2.width || r2.x > r1.x + r1.width) {
            return "Left or Right";
        } else {
            return "Above or Below";
        }
    }
}
