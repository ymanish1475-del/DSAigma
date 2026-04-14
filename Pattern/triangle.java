// package Pattern;

import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        int m=4 ;
        // int n=4;3
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n=");
        int n=sc.nextInt();
        
        for(int i=0;i<n;i++){
            // System.out.println("*");
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
