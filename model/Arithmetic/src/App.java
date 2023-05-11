import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);//扫描器，获取控制台输入值。
        System.out.println("请输入两个数字，用空格隔开(num1 num2):");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.println("num1+num2=:"+(num1+num2));
        System.out.println("num1-num2=:"+(num1-num2));
        System.out.println("num1×num2=:"+(num1*num2));
        System.out.println("num1÷num2=:"+(num1/num2)+"若取整余数为"+(num1%num2));
    }
}
