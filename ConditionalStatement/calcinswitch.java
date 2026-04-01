import java.util.Scanner;

public class calcinswitch {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        String op = sc.nextLine();



        switch (op) {
            case  "sum" : System.out.println("sum"+(a+b));
                
                break;

            case  "min" : System.out.println("min"+(a-b));
                break;

            case  "div" : System.out.println("div"+(a/b));
                break;

            case  "mul" : System.out.println("mul"+(a*b));
                break;

        
            default: System.out.println("plese fill corect operator");
                break;
        }

        


        
    }
    
}
