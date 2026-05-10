import java.util.Scanner;

public class Calculator {

    static int sum(int a,int b){    //FUNCTION OVERLOADING
        return a+b;
    }

    static int sum(int a,int b,int c){
        return a+b+c;

    }


    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // int c=sc.nextInt();
        // int d=sc.nextInt();
        // int a=/

        System.out.println(sum(6,4));
        System.out.println(sum(4,6,3));
        
    }
    
}
