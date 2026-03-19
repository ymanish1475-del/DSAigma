import java.util.*;

public class AofCircle {

    public static void main (String [] args){

        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        System.out.println("r="+r +"cm");

        double aoc= pi*r*r;

        System.out.println("area of circle =" +aoc+"cm^2");

    }
    
}
