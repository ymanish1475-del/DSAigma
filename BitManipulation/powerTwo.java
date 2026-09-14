public class powerTwo {

    public static boolean powerTwo(int n) {

         int bitMask=n-1;

         return (n&bitMask)==0;
        
    }

    public static void main(String[] args) {

        int n=32;
        System.out.println(powerTwo(1));
        
    }
    
}
