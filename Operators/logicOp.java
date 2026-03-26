import java.util.Scanner;

public class logicOp {

    public static void main (String [] args){

        Scanner s = new Scanner(System.in);

        System.out.print("a=");
        int a = s.nextInt();
        System.out.print("b=");
        int b = s.nextInt();
        System.out.print("c=");
        int c = s.nextInt();

        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);

        System.out.println(" a=b && b=c =" +( a==b &&b==c));
        System.out.println("a>b && a>c = "+(a>b && a>c));
        System.out.println("b>a && b>c = "+(b>a && b>c));
        System.out.println("c>b && c>a"+(c>b && c>a));

        System.out.println(" a=b || b=c =" +( a==b || b==c));
        System.out.println("a>b || a>c = "+(a>b || a>c));
        System.out.println("b>a || b>c = "+(b>a || b>c));
        System.out.println("c>b || c>a"+(c>b || c>a));
    



        
    }
    
}
