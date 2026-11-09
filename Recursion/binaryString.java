public class binaryString {

    public static void binStr(String str,int lastPlace,int n) {

        if(n==0){
            System.out.println(str);
            return;
        }

        binStr(str+"0", 0, n-1);

        if(lastPlace==0){
            binStr(str+"1", 1, n-1);
        }

        


        
    }
    public static void main(String[] args) {

        // String str="0101001000101";
        // binStr(str, 0);
        binStr("", 0, 3);
        
    }
    
}
