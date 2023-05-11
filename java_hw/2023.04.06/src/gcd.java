class gcd {
    int a , b;
    gcd(int a , int b){
        this.a = a;
        this.b = b;
    }
    public int find(){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println("最大公约数是：" + a);        
        return a;
    }
}
