public class Ass {

    //find array have uniq num

    public static boolean uniq(int num[] ) {
        int len= num.length;

       for(int i=0;i<len;i++){
        for(int j=i+1;j<len ;j++){
            if(num[i]==num[j]){
                return false;
            }
        }
       }

        return true;
        
    }
    public static void main(String[] args) {

        int num[]={1,2,3,4,4};
       
        System.out.println( uniq(num));
        
    }
    
}
