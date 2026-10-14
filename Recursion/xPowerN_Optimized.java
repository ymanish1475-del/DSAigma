public class xPowerN_Optimized {

    public static int  power(int x,int n) {

        if(n%2==0){

            if(n==0){
                return 1;
            }

            return power(x, n/2) * power(x, n/2);
        }else{
            if(n==1){
                return x;
            }
            return power(x, n/2) * power(x, n/2);
        }
        
    }

    public static void main(String [] args){
        int x=5;
        int n=4;

       int ans = power(x, n);
       System.out.println(ans);
    }
    
}
