import java.util.Scanner;

public class TenaryOp {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("a= ");

        int a= sc.nextInt();

        String type = (a%2==0)? "even" : "odd";

        System.out.println(type);

        System.out.print("mark=");
        int mark=sc.nextInt();

        String  result = (mark<33)? "fail" : "pass";
        System.out.println(result);


    }
    
}
