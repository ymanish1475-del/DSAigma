public class reverseArray {
    public static int [] reverse(int num[]) {
        int len= num.length-1;
        // int j=0;
        for(int i=len,j=0;i>=0,j<len;i++,j++){
            num[j]=num[i];
            
        }
        return num[];
    }
    public static void main(String[] args) {
        int num[]={1,2,4,6,8};
        // int rever[]={};
        reverse(num);
    }
}
