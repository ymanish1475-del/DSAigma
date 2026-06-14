// package ArraysMarvel;

public class MaxSubArrSum {

    public static void maxSum(int nums[] ) {

        int len=nums.length;
       
        int maxSum=0;
        for(int i=0;i<len;i++){
            // System.out.print(nums[i]+" ");

            for(int j=i+1;j<len;j++){
                 int currSum=0;

                for(int k=i;k<=j;k++){
                    // System.out.print(nums[k]+" ");
                    currSum=currSum+nums[k];
                }
                if(currSum>maxSum){
                    maxSum=currSum;
                }
                System.out.print(maxSum+" ");
            }
            System.out.println();
        }
        System.out.println("max sum= "+maxSum);

        
    }
    public static void main(String[] args) {
        int nums[]={1,-2,6,-1,3};
        maxSum(nums);

    }
}
