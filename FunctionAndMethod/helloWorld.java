// package FunctionAndMethod;

import java.util.Scanner;

public class helloWorld {

    public static void hello(){
        System.out.println("hello world");
        return;
        // if function type is void only then "return " does  not to requre to write in function otherwise its compulsory or through the error
    }
    public static int calsum(int n, int m) {    //parametre or formal parameter
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b= sc.nextInt();
        int sum = n+m;
        // System.out.println(sum);
        return sum;
        
    }

    public static void main(String[] args) {
        hello();
        

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int sum =calsum(a,b);   //argument 
        System.out.println("sum is : "+sum);
        // int sum = a+b;
        // System.out.println(sum);
        
    }
    
}
