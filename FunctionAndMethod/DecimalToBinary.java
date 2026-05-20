import java.util.Scanner;

public class DecimalToBinary {

    public static void deciTobinary(int deci){
        int bin=0;
        int value=0;

        while(deci>0){
            bin=deci%2;
            deci=deci/2;
            value=(value*10)+bin;

        }
        System.out.println(value);
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("enter num : ");
        int deci=sc.nextInt();
        deciTobinary(deci);

    }
    

}
