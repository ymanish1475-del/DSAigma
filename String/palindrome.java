// package String;

import java.util.Scanner;

public class palindrome {

    public static boolean palin(String name) {

        int len =name.length();

        int j=(name.length()-1);
        // System.out.println(len);
        // System.out.println(j);
        int k=0;

        for(int i=0;i<(name.length())/2;i++){

            // System.out.println(name.charAt(i));
            // System.out.println(name.charAt(j));
           
            if(name.charAt(i)==name.charAt(j)){
                 j--;
                

            }else {
                return false;
            }
        }

        return true;
        
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter name for checking palindrome:- ");
        String name=sc.next();
        palin(name);
        System.out.println(palin(name));


        // int j=name.length()-1;

       
        // String palin=new String();

        // for(int i=name.length()-1;i>=0;i--){
        //     palin+=name.charAt(i);
        // }

        
        // System.out.println(palin);

        // if("hello"=="hello"){
        //     System.out.println("oh");
        // }
        // if(name==palin){
        //     System.out.println("palindrome");
        // }else{
        //     System.out.println("code is not working");
        // }

    //     int j=name.length();

    //   for(int i=j-1;i>=0;i--){
    //     palin+=name.charAt(i);

    //   }

    //     if(name==palin){
    //         System.out.println(name +" is palindrome");
    //     }else if(name!=palin){
    //         System.out.println(name+" is not palindrome");
    //     }else{
    //         System.out.println("code is not working");
    //     }
    }
    
}
