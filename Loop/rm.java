// package Loop;

import java.util.Scanner;

public class rm {

    public static void main(String []args){

        // int num = 16579;
        

        // for(int i=0;i<=5;i++){
        //     int a =num%10;
        //     num=num/10;
        //     System.out.print(a);
            
            
        // }
        Scanner sc= new Scanner(System.in);
        System.out.print("ENTER NUMBER = ");
        int num = sc.nextInt();
        System.out.print("REVERSE = ");
        int rever=0;

     

        while(num>0){
            int mod =num%10;
            num=num/10;
            // int rever=0;
             rever= rever*10+mod;
               
            
           
        }
        System.out.print(rever);
        
            

        
        

        // while(num>0){
        //     int mod=num%10;
        //     num=num/10;
        //     System.out.print(mod);
        //     int rever = num*10+mod;

        //     System.out.println(rever);
           

        // }
           
        


    }
    
}
