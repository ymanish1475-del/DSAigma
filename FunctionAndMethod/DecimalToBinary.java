public class DecimalToBinary {

    public static void deciTobinary(int deci){
        int bin=0;

        while(deci>0){
            bin=deci%2;
            deci=deci/2;
            bin=(bin*10)+bin;

        }
        System.out.println(bin);
    }

    public static void main(String[] args) {
        
        int deci=211;
        deciTobinary(deci);

    }
    
}
