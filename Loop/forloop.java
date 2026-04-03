// package Loop;

import java.util.Scanner;

public class forloop {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER NAME= ");
        String name=sc.nextLine();
        System.out.print("TIMES=");
        int n=sc.nextInt();


        for(int i=0;i<=n;i++){
            System.out.println("name="+name);
        }
        System.out.println("NAME="+name+"prints "+n+"times");
    }
    
}
