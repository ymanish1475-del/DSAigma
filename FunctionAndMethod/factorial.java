import java.util.Scanner;

public class factorial {

    static int fact(int a,int fact){
        if(a==1) return 1;

        else{
            for(int i=1;i<=a;i++){
             fact= fact*i;
        }
        // System.out.println("fact= "+fact);

        }
        return fact;

        // a=a*(a-1);
        // else{
        //     for(int i=1;i<=a++){
        //         n=a*
        //     }
        // }
        // int fact=n*(n-1);
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.print("enter n= ");
        int a=sc.nextInt();
        int fact=1;
        // int n=1;
        // for(int i=1;i<=a;i++){
        //      fact= fact*i;
        // }
        // System.out.println("fact= "+fact);
        System.out.println(fact(a,fact));
        


    }
    
}
