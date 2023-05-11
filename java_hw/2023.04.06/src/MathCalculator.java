public class MathCalculator {
    // 两个数的加法
    public static double add(double a, double b) {
        return a + b;
    }

    // 两个数的减法
    public static double subtract(double a, double b) {
        return a - b;
    }

    // 两个数的乘法
    public static double multiply(double a, double b) {
        return a * b;
    }

    // 两个数的除法
    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("除数不能为0");
        }
        return a / b;
    }

    // 某数的相反数
    public static double opposite(double a) {
        return -a;
    }

    // 某数的倒数
    public static double reciprocal(double a) {
        if (a == 0) {
            throw new IllegalArgumentException("零没有倒数");
        }
        return 1 / a;
    }

    // 某数的绝对值
    public static double absoluteValue(double a) {
        return Math.abs(a);
    }

    // 取两数中较大的数
    public static double max(double a, double b) {
        return Math.max(a, b);
    }

    // 取两数中较小的数
    public static double min(double a, double b) {
        return Math.min(a, b);
    }

    // 计算浮点数d的最接近整数值
    public static int round(double d) {
        return (int) Math.round(d);
    }

    // 计算浮点数d的平方根
    public static double sqrt(double d) {
        if (d < 0) {
            throw new IllegalArgumentException("不能对负数开方");
        }
        return Math.sqrt(d);
    }
}