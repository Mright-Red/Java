//Unicode编码无符号编码，储存有65536个字符
public class App {
    public static void main(String[] args) throws Exception {
        char word = 'd',word2 = '@',c1 = '\\',c2 = '\u2605';
        int p = 23045,p2 = 45213;
        System.out.println("d在Unicode表中的顺序位置是：" +(int)word);
        System.out.println("@在Unicode表中的顺序位置是：" +(int)word2);
        System.out.println("Unicode表中的第23045位是：" +(char)p);
        System.out.println("Unicode表中的第45213位是：" +(char)p2);
        System.out.println(c1);//转义字符'/'
        System.out.println(c2);
    }
}
