public class subArr {
    public static void subArr(int nums[]) {
        int len=nums.length;
        int first = 0;
        int end=nums.length-1;

        for(int i=first;i<len;i++){
            for(int j=;j<=end;j++){
                System.out.print(nums[first]+" "+nums[j]);

            }
            first++;
            end--;
            System.out.println();

        }
        // for(int i=0;i<len;i++){
        //     System.out.print(nums[i]+" ");
        //     for(int j=i+1;j<l;j++){
        //         System.out.print(nums[i]);
        //         System.out.print(nums[j]+" ");
        //     }
        //     System.out.println();
        // }
        
    }
    public static void main(String[] args) {
        int nums[]={2,4,5,6,8};
        subArr(nums);


    }
}
