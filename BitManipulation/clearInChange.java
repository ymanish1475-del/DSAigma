public class clearInChange {

    public static int  clearInRange(int n,int i,int j) {
        int a=((~0)<<(j+1));
        int b=(1-i)<<1;

        int bitMask= a|b;
        return n&bitMask;
    }

    public static void main(String[] args) {

        
        System.out.println(clearInRange(26, 1, 2));
        
    }
    
}
