public class BubbleSort {

    public static int [] BubbleSort(int num[] ) {
        int len= num.length;

        for(int k=0;k<len;k++){

        

        for(int i=1;i<len;i++){
            if(num[i-1]>num[i]){
                 int temp = num[i-1];
                 num[i-1]=num[i];
                 num[i]=temp;

            }
        }
    }
        return num;
        
    }
    
    public static void main(String[] args) {
        int num[]={7,3,9,5,1,4};
        int nums[]=BubbleSort(num);

        for(int i=0;i<nums.length;i++){
            System.out.print(" "+nums[i]);
        }

    }
}
