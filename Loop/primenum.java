import java.util.Scanner;
import java.util.*;

public class primenum {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);

        System.out.print("ENTER NUM= ");
        int num=sc.nextInt();

        boolean prime=true;

        if(num==2){
            System.out.println("num is prime");
        }else{
            for(int i=2;i<=Math.sqrt(num);i++){ //num-1  under root (n)
                prime=false;
            }
        }
        // System.out.println(prime+" num is prime");
        if(prime==true){
            System.out.println(num+" is prime");
        }else{
            System.out.println(num+" is not prime");
        }

        }

        

    }

    

