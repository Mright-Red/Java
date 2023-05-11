
public class flower{
    public void judge1(){    
        for(int a = 1; a <= 9; a++)
            for(int b = 0; b <= 9; b++)
                for(int c = 0; c <= 9; c++)
                    if(Math.pow(a,3.0) + Math.pow(b,3.0) + Math.pow(c,3.0) == a * 100 + b * 10 + c)
                        System.out.println(a * 100 + b * 10 + c);
                        
    }
} 