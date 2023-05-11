public class App {
    static final double PI = 3.14;
    static int age = 23;
    public static void main(String[] args) throws Exception {
        final int number;
        number = 1235;
        age = 22;//局部变量排挤成员变量；
        //number = 1236，final定义的变量不可再次被赋值！！
        System.out.println("常量PI的值为：" + PI);
        System.out.println("赋值后的number的值为：" + number);
        System.out.println("赋值后的age的值为：" + age);
    }
    public static double getPi() {
        return PI;
    }
    public static int getAge() {
        return age;
    }
    public static void setAge(int age) {
        App.age = age;
    }
}
