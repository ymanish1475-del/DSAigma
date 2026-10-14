// package Recursion;

public class fibonacci {

    // public static int  fibo(int s,int k ) {

    //     return s+k;
        
    // }
//calculate the nth num of fibonacci..
    public static int fibonacci(int n) {


        if(n==0||n==1){
            return n;
        }

        return fibonacci(n-1)+fibonacci(n-2);
        

        
        
    }

    public static void main(String[] args) {
        int n=10;
        int ans = fibonacci(n);
        System.out.println(ans);
    }
    
}
