// package Pattern-Advanced;

import java.util.Scanner;

public class InvRotHalfPyra {

    public static void pyramid(int m,int n){
        for(int i=1;i<=m;i++){
            for(int j=1;j<=m-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            // for(int j)
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER N : ");
        int m=sc.nextInt();
        int n=5;
        pyramid(m, n);

    }
}
