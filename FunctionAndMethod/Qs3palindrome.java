import java.util.Scanner;

public class Qs3palindrome {

    public static int palindrome(int num) {
        int value=0;
        int mod=0;
        int numb=num;

        while(num>0){
            mod =num%10;
            value=(value*10)+mod;
            num=num/10;
        }
       
        if(numb==value){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }

         return value;

        
    }

    public static void main(String[] args) {
        // int num=121;
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER NUM : ");
        int num=sc.nextInt();

        
        System.out.println(palindrome(num));
        
    
}
}
