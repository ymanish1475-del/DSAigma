
import java.util.*;

public class Question {

    public static void main (String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("your bill");

        System.out.print("pencil=");
        float p = sc.nextFloat();

        System.out.print("pen=");
        float n = sc.nextFloat();

        System.out.print("eraser=");
        float e = sc.nextFloat();

        System.out.println("your products");

        System.out.println("pencil="+p);
        System.out.println("pen="+n);
        System.out.println("eraser="+e);

        float t = (float)p+n+e ;

        System.out.println("total cost ="+t);

        // adding gst

        float gst = (float)t+t*(18f/100f);

        System.out.println(" with gst = "+gst);

    


        

// question 2
        // System.out.print("give the side of squre=");
        // int a = sc.nextInt();

        // System.out.println("your input="+a);

        // int sq = a*a;

        

        // System.out.println("area of squre="+sq+"m^2");

// question 1
        // a
        // System.out.print("a=");
        // int a = sc.nextInt();

        // // b

        // System.out.print("b=");
        // int b = sc.nextInt();

        // // c

        // System.out.print("c=");
        // int c = sc.nextInt();

        // float av = (a+b+c)/3f;

        // System.out.println("av="+av);






    }
    
}
