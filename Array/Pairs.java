public class Pairs {
    public static void Pairs(int nums[]) {
        int len=nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                System.out.print("("+nums[i]+","+nums[j]+") , ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int nums[]={2,4,5,6,8};
        Pairs(nums);

    }
}
