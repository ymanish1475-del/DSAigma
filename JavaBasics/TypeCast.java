
import java.util.*;

public class TypeCast {

    public static void main (String [] args){

        Scanner sc= new Scanner(System.in);

        // float a = sc.nextInt();
        // System.out.println(a);

        // int a= sc.nextInt();

        // int b= a;

        // System.out.println("b="+b);

        // float a = 999.9979f;
        // int b= (int)a;

        // System.out.println(b);

        // char a ='z';

        // int b= a;
        // System.out.println(b);

        // type promotion 
        // int a = 890;
        // char b='b';
        // float c=892.890f;

        // double d= a+b+c;

        // System.out.println("sum d  ="+d);

        char a='a';
        char b = 'b';

        System.out.println((int)(a));
        System.out.println((int)(b));

        System.out.println(b-a);
        System.out.println(a-b);

        char c='c';
        System.out.println((int)(c)); 
        // write
        System.out.println((c)(int));
        // wrong

        // char d= f-e; int se char mai convert nahi kar sakte

    }
    
}
