class PrimeNumber {
    double number , remainder;
    PrimeNumber(double number){
        this.number = number;
    }

    public void judge2(){
        if(number < 2)
        System.out.println("非法输入");
        if(number == 2)
        System.out.println("这是素数"+number);
        if(number > 2){
            for(int i = 2; i <= Math.sqrt(number) ; i++){
                remainder =  number % i;//参量
                if(number % i == 0){
                    System.out.println("这不是素数:"+number);
                    break;
                }                          
            }
            if(remainder != 0)
            System.out.println("这是素数:"+number);

        }
    }
}
