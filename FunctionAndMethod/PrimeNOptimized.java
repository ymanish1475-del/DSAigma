import java.util.Scanner;

public class PrimeNOptimized {

    public static boolean prime(int n) {

        for (int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        // int n=6;
        boolean prime=true;
        System.out.println(prime(n));

        
    }
    
}
