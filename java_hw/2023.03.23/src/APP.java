public class APP{
    public static void main(String[] args)throws Exception{
        SUM que1_1 = new SUM( 1, 1, 100, 0);
        System.out.println(que1_1.sum());
        SUM que1_2 = new SUM( 1, 2, 10, 1);
        System.out.println(que1_2.sum());
        SUM que1_3 = new SUM( 1, 1, 10, 1);
        System.out.println(que1_3.sum());



        LETTER q2 = new LETTER();
        q2.Positive();
        System.out.println();
        q2.reverse();
        System.out.println();
       
       
        
        QE q3 = new QE();
        q3.calculate();
    }
}