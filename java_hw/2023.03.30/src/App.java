public class App {
    public static void main(String[] args) throws Exception {
        flower q1 = new flower();
        q1.judge1();


        PrimeNumber q2_1 = new PrimeNumber(0);
        q2_1.judge2();
        PrimeNumber q2_2 = new PrimeNumber(2);
        q2_2.judge2();
        PrimeNumber q2_3 = new PrimeNumber(23);
        q2_3.judge2();
        PrimeNumber q2_4 = new PrimeNumber(49);
        q2_4.judge2();


        LeapYear q3_1 = new LeapYear(2000);
        q3_1.judge3();
        LeapYear q3_2 = new LeapYear(1900);
        q3_2.judge3();
        LeapYear q3_3 = new LeapYear(2002);
        q3_3.judge3();
        LeapYear q3_4 = new LeapYear(2008);
        q3_4.judge3();
    }
}
