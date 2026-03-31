import java.util.*;
public class OddEven {

    public static void main (String [] args ){

        Scanner s = new Scanner(System.in);
        System.out.print("a=");

        int a = s.nextInt();

        if(a%2 == 0){
            System.out.println(a+" is even");
        }else{
            System.out.println(a+" is odd");
        }

    }
    
}
