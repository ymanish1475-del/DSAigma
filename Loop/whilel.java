// package Loop;

import java.util.Scanner;

public class whilel {

    public static void main(String [] args){

        // int counter=0;
        // while(counter<10){
        //     System.out.println("m");
        //     counter++;
        // }

        Scanner sc = new Scanner(System.in);

        int c=1;
        int sum=0;


        System.out.print("n=");
        int n= sc.nextInt();
        while(c<=n){
            System.out.print(c+". ");
             sum =sum+c;
            c++;
        }
        System.out.println("sum = "+sum);
            
        
        // while (c<=10) {
        //     System.out.println(c+".");
        //     c++;
            
        // }


        // System.out.print("ENTER NAME = ");/


        // String name = sc.nextLine();
        // System.out.print("TIMES= ");
        // int num=sc.nextInt();

        // while(c<=num){
        //     System.out.println(c+"."+name);
        //     c++;
        //     System.out.println();

        // }
        // System.out.println("your name print "+num+" times");
    }
    
}
