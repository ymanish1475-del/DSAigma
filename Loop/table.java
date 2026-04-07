import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n = ");
        int n= sc.nextInt();
        System.out.println("table=");

        int mul=1;
        for(int i=1;i<=10;i++){

            mul=n*i;
            System.out.print(mul+" ");

        }
    }
    
}
