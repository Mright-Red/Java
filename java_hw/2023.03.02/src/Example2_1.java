public class Example2_1{
    public static void main(String[] args) {
        char c='А';
        System.out.println("俄文字母"+c+"在unicode表中的顺序位置:"+(int)c);
        System.out.println("俄文字母表：");
        
        for(int i=(int)c;i<c+64;i++){
            System.out.print(" "+(char)i);
            //大小写换行
            if((i+1)%1072==0){
                System.out.println();
            }
        }
    }
}