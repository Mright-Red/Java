public class CharacterCounterTest {
    public static void countCharacters(String str) {
        int upperCase = 0, lowerCase = 0, digits = 0, spaces = 0, others = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isUpperCase(ch)) {
                upperCase++;
            } else if (Character.isLowerCase(ch)) {
                lowerCase++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                others++;
            }
        }
        System.out.println("大写字母数量: " + upperCase);
        System.out.println("小写字母数量: " + lowerCase);
        System.out.println("数字数量: " + digits);
        System.out.println("空格数量: " + spaces);
        System.out.println("其他字符数量: " + others);
    }    
    public static void main(String[] args) {
        String str = "Hello World! 123";
        countCharacters(str);
    }
}