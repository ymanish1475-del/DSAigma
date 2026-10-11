// package Recursion;

public class fibonacci {

    public static int  fibo(int s,int k ) {

        return s+k;
        
    }

    public static int fibonacci(int n) {


        if(n==0){
            return 0;
        }
        n--;

        int s=0;
        int k=1;

        return fibo(s, fibo(s, k));
      
        
    }

    public static void main(String[] args) {
        int n=10;
        int ans = fibonacci(n);
        System.out.println(ans);
    }
    
}
