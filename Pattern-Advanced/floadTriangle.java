import java.util.Scanner;

public class floadTriangle {

    public static void pyramid( int n) {
        int m=1;
        
            for(int i=1;i<=n;i++){

                for(int j=1;j<=i;j++){
                    System.out.print(m+" ");
                    m++;
                }
                System.out.println();
                
            }
        

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER HOW MUCH LINE YOU WANT PRINT FLOAD TRIANGLE : ");
        int n=sc.nextInt();
        pyramid(n);

    }
}
