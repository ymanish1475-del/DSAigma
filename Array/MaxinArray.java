public class MaxinArray {

    public static int  maxNum( int nums[], int max) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
        int []nums={1,3,4,5,6,7,8,90,8,6,3,322,4,5,76};
        int max=0;
        
        System.out.println(maxNum(nums,max));
    }
}
