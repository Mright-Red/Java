class traveller{
    double height , price , age;
    public void fares(double height , double age){
        if(age > 70){
            price = 40;
            System.out.println("老年票：" + price + "CNY");
        }else if(age < 8 || height < 1.2){
            price = 0;
            System.out.println("儿童票：" + price + "CNY");
        }else{
            price = 80;
            System.out.println("成人票：" + price + "CNY");
        }        
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        traveller q1_1 = new traveller();
        q1_1.fares(1.1, 15);
        traveller q1_2 = new traveller();
        q1_2.fares(1.8, 75);
        traveller q1_3 = new traveller();
        q1_3.fares(1.8, 50);     
    }
}
