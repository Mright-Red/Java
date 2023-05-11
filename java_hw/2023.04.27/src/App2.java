import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int input;
            try {
                System.out.print("请输入一个整数: ");
                input = scanner.nextInt();
                if (input > 1000) {
                    throw new Exception("录入整数过大，请重新输入一个整数!");
                } else if (input < 0) {
                    throw new Exception("录入整数过小，请重新输入一个整数!");
                }
                System.out.println("录入的整数是: " + input);
            } catch (Exception e) {
                System.out.println("错误: " + e.getMessage());
            }
        }
    }
}