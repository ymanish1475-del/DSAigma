import java.util.Scanner;

public class Char2Pattern {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter line = ");
        int n=sc.nextInt();
        // int n= 'e';
        char a='A';
        for(int i=0;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)a);
                a++;
                
            }
            System.out.println();
        }
        // System.out.println('97');
    }
    
}
