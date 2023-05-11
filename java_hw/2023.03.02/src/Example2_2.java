import java.util.Scanner; 
/**
 * @author description
 * @version info
 */
public class Example2_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        if (scan.hasNextInt()) {
            int int1 = scan.nextInt();
            System.out.println("请再输入一个整数：");
            if (scan.hasNextInt()) {
                int int2 = scan.nextInt();
                int int3 = int1 * int2 ;
                System.out.println("两者的积是：" + int3);
            }
        }
        scan.close();
    }
}