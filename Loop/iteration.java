import java.util.Scanner;

public class iteration {
    public static void main(String [] args ){

        Scanner sc= new Scanner(System.in);
        System.out.println("enter number");
        int num= sc.nextInt();

        for(int i=0;i<=num;i++){

            if(i==5){
                continue;
            }
            System.out.println(i);
        }
    }
    
}
