import java.util.Scanner;

public class Prime {

    public static boolean prime(int n,boolean isPrime){
        // corner casee
        if(n==1){
            System.out.println("");
        }

        
        for(int i=2 ; i<n ; i++) {
            if(n%i==0){
                isPrime=false;

            }
            // isPrime=false;
            // int m=n%i
            
        }
        return isPrime;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print(" ENTER N : ");

        int n=sc.nextInt();
        // String name="";
        boolean isPrime=true;

        System.out.println(prime(n,isPrime));


        
    }
    
}
