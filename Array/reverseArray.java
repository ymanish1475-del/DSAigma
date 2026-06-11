public class reverseArray {
    public static int [] reverse(int num[]) {

        int first =0,end=num.length-1;
        int temp=0;

        while(first<end){
            temp=num[first];
            num[first]=num[end];
            num[end]=temp;
            first++;
            end--;
        }
        return num;
       
    }
    public static void main(String[] args) {
        int num[]={1,2,4,6,8};
        // int rever[]={};
       reverse(num);

       for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");
       }
    }
}
