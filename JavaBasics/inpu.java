
import java.util.*;


public class inpu {

    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);
        // String  input = name.next();   sirf ek word input leta hea
        String  input = name.nextLine();
        // pori line sture kaeta hea


        // System.out.println("aapka name :");
        

        Scanner number = new Scanner(System.in);
        int age = number.nextInt();

        System.out.println("name:" +input);

        System.out.println("age="+age);
        
    }
    
}
