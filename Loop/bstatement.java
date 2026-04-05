// package Loop;

import java.util.Scanner;

public class bstatement {
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int num=sc.nextInt();

        for(int i=0;i<num;i++){
            if(i%10==0){
                break;
            }
            System.out.println(i);


        }
    }
    
}
