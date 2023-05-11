public class StringConcatenatorTest {
    public static String concatenateStrings(String str1, String str2, String str3) {
        // Determine which two strings are longer and concatenate them first
        String longerStr = str1.length() >= str2.length() ? str1 : str2;
        String shorterStr = str1.length() < str2.length() ? str1 : str2;
        String result = longerStr + shorterStr + str3;
        // If the third string is shorter than the first two, concatenate it in the middle
        if (str3.length() < shorterStr.length()) {
            int index = result.length() / 2;
            result = result.substring(0, index) + result.substring(index);
        }
        return result;
    }
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "123";
        String result = concatenateStrings(str1, str2, str3);
        System.out.println(result); // Output: HelloWorld123
    }
}