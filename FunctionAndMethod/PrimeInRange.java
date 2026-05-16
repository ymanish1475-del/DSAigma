import java.util.Scanner;

public class PrimeInRange {

    public static boolean prime(int n){
        for(int i=2;i<=Math.sqrt(n);i++){

                if(n%i==0){
                 return false;
                    // System.out.println();
                }
            }
            return true;


    }
    public static void primeRange(int n) {
        for(int i=2;i<=n;i++){
            if(prime(i)){
                System.out.print(i+" ");
            }
        }
        
    }
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //  boolean isPrime=true;

        int n =sc.nextInt();
        
        System.out.println();
        primeRange(n);

    }
    
}
