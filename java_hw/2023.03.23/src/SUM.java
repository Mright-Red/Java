
class SUM{
    double  a1  , d ;
    int flag , n ;
    SUM(double a1  , double d , int n , int flag ){
        this.a1 = a1 ;
        this.d = d ;
        this.n = n ;
        this.flag = flag ;
    };
    public double sum(){
        double ans = 0;
        if(flag == 0){
            ans = a1 * n + d * n * (n - 1) / 2 ;
        }
        else if(flag == 1){
            if(d == 1)
                ans =  n * a1;
            else
                ans = a1 * (1 - Math.pow(d, n)) / (1 - d);
        }
        return ans;
    }

}