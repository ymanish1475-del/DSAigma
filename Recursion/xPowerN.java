public class xPowerN {

    public static int  xPowerN(int x,int n) {

        if(n==0){
            return 1;
        }

        return x*xPowerN(x, n-1);
        
    }
    
    public static void main(String[] args) {
        int x=5;
        int n=4;

        int ans=xPowerN(x, n);
        System.out.println(ans);
    }
}
