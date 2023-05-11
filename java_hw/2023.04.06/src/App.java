public class App {
    public static void main(String[] args) throws Exception {
 
        gcd q1_1 = new gcd(27, 18);
        q1_1.find();
        gcd q1_2 = new gcd(25, 13);
        q1_2.find();
        gcd q1_3 = new gcd(25, 0);
        q1_3.find();

    System.out.println();

        Resume resume = new Resume("张三", "男", 25, "北京市朝阳区", "本科");
        System.out.println(resume.getName()); // 输出："张三"
        System.out.println(resume.getGender()); // 输出："男"
        System.out.println(resume.getAge()); // 输出：25
        System.out.println(resume.getHomeAddress()); // 输出："北京市朝阳区"
        System.out.println(resume.getEducationBackground()); // 输出："本科"
 
    //Setting newResume
        resume.setName("李四");
        System.out.println(resume.getName()); // 输出："李四"
        resume.setGender("女");
        System.out.println(resume.getGender()); // 输出："女"
        resume.setAge(26);
        System.out.println(resume.getAge()); // 输出：26
        resume.setHomeAddress("上海市浦东新区");
        System.out.println(resume.getHomeAddress()); // 输出："上海市浦东新区"
        resume.setEducationBackground("硕士");
        System.out.println(resume.getEducationBackground()); // 输出："硕士"

    System.out.println();

    double a = 5.0;
    double b = 2.0;
    double d = 3.76;
    // 两个数的加法
        System.out.println(MathCalculator.add(a, b)); // 输出：7.0
    // 两个数的减法
        System.out.println(MathCalculator.subtract(a, b)); // 输出：3.0
    // 两个数的乘法
        System.out.println(MathCalculator.multiply(a, b)); // 输出：10.0
    // 两个数的除法
        System.out.println(MathCalculator.divide(a, b)); // 输出：2.5
    // 某数的相反数
        System.out.println(MathCalculator.opposite(a)); // 输出：-5.0
    // 某数的倒数
        System.out.println(MathCalculator.reciprocal(a)); // 输出：0.2
    // 某数的绝对值
        System.out.println(MathCalculator.absoluteValue(-a)); // 输出：5.0
    // 取两数中较大的数
        System.out.println(MathCalculator.max(a, b)); // 输出：5.0
    // 取两数中较小的数
        System.out.println(MathCalculator.min(a, b)); // 输出：2.0
    // 给定浮点数d，计算最接近d的整数值
        System.out.println(MathCalculator.round(d)); // 输出：4.0
    // 计算d的平方根
        System.out.println(MathCalculator.sqrt(d)); // 输出：1.93907……

    System.out.println();

        animals voice ;
        voice = new dog();//输出狗
        voice.CanCry();
        voice = new cat();//输出猫
        voice.CanCry();

    }   
}
