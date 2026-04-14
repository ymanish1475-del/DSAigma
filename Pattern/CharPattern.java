import java.util.*;
public class CharPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter char = ");
        char n=sc.next().charAt(0);
        // int n= 'e';
        for(int i='a';i<=n;i++){
            for(int j='a';j<=i;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
        // System.out.println('97');
    }
    
}
