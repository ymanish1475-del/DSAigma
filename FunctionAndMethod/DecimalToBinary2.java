import java.util.Scanner;

public class DecimalToBinary2 {

    public static void btd(int dec) {
        int value=0;
        int pow=0;
        while(dec>0){
            int rem=dec%2;
            value=value+(rem*(int)Math.pow(10,pow));
            pow++;
            dec=dec/2;


        }
        System.out.println(value);
        
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);


        int dec=sc.nextInt();

        int a=40;
        System.out.println(a);

        // btd(dec);
        
    }
    
}
