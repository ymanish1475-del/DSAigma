public class MaxinArray {

    public static int  maxNum( int nums[], int max,int min) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]>max ){
                max=nums[i];
               
            }
            if(nums[i]<min){
                min=nums[i];
            }

        }
        System.out.println("min is "+ min);
        return max ;
        
    }
    public static void main(String[] args) {
        int []nums={3,4,5,6,7,8,90,8,6,3,322,4,5,76};
        // int max=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        
        System.out.println(maxNum(nums,max,min));
    }
}
