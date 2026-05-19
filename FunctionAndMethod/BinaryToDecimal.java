import java.util.Scanner;

public class BinaryToDecimal{

    public static void btd(int binary,int power,int value) {

        int mod=0;

        while(binary>0){
            mod=binary%10;
            value=value+(mod*(int)Math.pow(2, power));    //math pow always calculate as double 
            power++;
            binary=binary/10;
        }
        // return value;
        System.out.println(value);
        
        // for(int i=0;i<=binary.length();i++){

        // }
    }

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        // int binary=1010;

        int power=0;
        int value=0;
        
        btd(binary,power,value);
    }
}