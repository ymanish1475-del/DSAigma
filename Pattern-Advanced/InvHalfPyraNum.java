// package Pattern-Advanced;

import java.util.Scanner;

public class InvHalfPyraNum {

    public static void pyramid(int n){
        int m=n;

        for(int j=n;j>=1;j--){
            for(int i=1;i<=n;i++){
            System.out.print(i);
            
          }
          System.out.println();
          n=n-1;
        }
        

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        pyramid(n);
    }
}
