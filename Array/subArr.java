// import javax.sound.sampled.SourceDataLine;

public class subArr {
    public static void subArr(int nums[]) {
        int len=nums.length;
        // int first = 0;
        // int end=1;
        int ts=0;
        // int sum

        for(int i=0;i<len;i++){
            // System.out.print(nums[i]+" ");
            for(int j=i;j<len;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print("["+nums[k]+"],"+" ");
                    sum=sum+nums[k];
                    System.out.print(sum);
                }
                ts++;

                

                System.out.println();
                
            

            }
            System.out.println();
        }
        System.out.println("total subarr="+ts);
       
        
    }
    public static void main(String[] args) {
        int nums[]={2,4,5,6,8};
        subArr(nums);


    }
}
