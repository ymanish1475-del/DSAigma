// package Recursion;

public class numDec {

    public static void numDec(int n) {

        

        if(n<1){
            return;

        }
        
      
        System.out.print(n+" ");
        numDec(n-1);
       
        
        
    }
    public static void numIncain(int n) {

        if(n==1){
            System.out.println(n);
            return;
        }

        numIncain(n-1);
        System.out.println(n);
        
    }
    

    public static void main(String[] args) {

        int n=10;
        // numDec(n);
        numIncain(n);
        
    }
}
