public class setIthBit {

    public static int setIthBit(int n,int i){
        int bitMask=1<<i;

        return n|bitMask;
    }

    public static int clearIthBit(int n,int i){

        int bitMask=~(1<<i);
        return n&bitMask;

    }

    public static int updateBit(int n,int i,int newBit){

        if(newBit==0){
            return clearIthBit(n,i );
        }else{
           
             return setIthBit(n, i);
        }

    }

    public static int clearBits(int n,int i) {
        int bitMask=(~0)<<i;
        return n&bitMask;

        
    }

    public static void main(String[] args) {

        
        // System.out.println(setIthBit(16, 3));
        // System.out.println(clearIthBit(16, 3));

    //    System.out.println(updateBit(16, 2, 1));
    System.out.println(clearBits(15, 2));
        
    }
    
}
