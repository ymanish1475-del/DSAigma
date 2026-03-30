// package ConditionalStatement;

import java.util.Scanner;

public class large {
    public static void main(String [] args ){

        Scanner s = new Scanner(System.in);

        int a= s.nextInt();
        int b= s.nextInt();
        int c= s.nextInt();

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("C="+c);

        if(a>b && a>c){
            System.out.println(a+"is greater");
        }
        if(b>a && b>c){
            System.out.println(b+"b is greater");
        }
        else{
            System.out.println("c="+ c +"is greater");
        }


    }


    
}
