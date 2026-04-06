import java.util.Scanner;

public class prime {
    public static void main(String [] args){

        
        Scanner sc = new Scanner(System.in);

        System.out.print("enter num=");
        int num=sc.nextInt();

        boolean isPrime=true;
        for(int i= 2 ; i<num;i++){
            if(num%i==0){
                isPrime=false;
                
                 
            
        }
        // System.out.println("not prime");
        
    }
        // int i=2;
        // while(num%i==0){
        //     if(i>=num){
        //         break;
        //     }
        //     System.out.println("num is not prime");

        // }


        // for (int i=2;i<=num-1;i++){

        //     if(num%i==0 ){
        //         System.out.println("number is not prime ");
        //     }else{
        //         System.out.println("prime number");
        //     }
        // }
        // do{
        //     System.out.println("enter number");
        //     int num=sc.nextInt();
        //      if(num%i==0 ){
        //         System.out.println("number is not prime ");
        //     }else{
        //         System.out.println("prime number");
        //     }

        // }while()
    }
    
}
