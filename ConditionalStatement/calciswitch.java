import java.util.*;

public class calciswitch {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        // String op = "sum";
        // char op= sc.next().charAt(0);
        String op = sc.next();
        


        switch (op) {
            case  "+" : System.out.println("sum="+(a+b));
                
                break;

            case  "-" : System.out.println("min="+(a-b));
                break;

            case  "/" : System.out.println("div="+(a/b));
                break;

            case  "*" : System.out.println("mul="+(a*b));
                break;

            case "%" : System.out.println("mod="+(a%b));
                break;

        
            default: System.out.println("plese fill corect operator");
                break;
    }

}
    
}
