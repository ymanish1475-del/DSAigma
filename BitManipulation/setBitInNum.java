public class setBitInNum {

    public static int  setBitInNum(int n) {

        int count=0;

        while(n>0){
            if((n&1)!=0){
                count++;
            }
           n= n>>1;
        }

        return count;
        
    }

    public static void main(String[] args) {
        int n=15;
        System.out.println(setBitInNum(16));
    }
    
}
