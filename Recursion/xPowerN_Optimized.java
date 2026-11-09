public class xPowerN_Optimized {

    public static int  power(int x,int n) {

       if(n==0){
        return 1;

       }

       int halfPower=power(x,n/2);
       int power=halfPower*halfPower;

       if(n%2!=0){
        return x*halfPower;
       }

       return power;
       
        
    }

    public static void main(String [] args){
        int x=4;
        int n=4;

       int ans = power(x, n);
       System.out.println(ans);
    }
    
}
