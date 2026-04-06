import java.util.Scanner;

public class primenum {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("ENTER NUM= ");
        int num=sc.nextInt();

        boolean prime=true;

        for(int i=2;i<num-1;i++){
            if(num%i==0){
                prime=false;
            }
        }
        System.out.println(prime+" num is prime");

    }
    
}
