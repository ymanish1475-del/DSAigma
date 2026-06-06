public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={12,34,5,6,67,890,6,5,4,3,3,566,76};
        int key=5;

        int len=arr.length;
        for(int i=0;i<len;i++){
            if(arr[i]==key){
                System.out.println(" i = "+i );
            }
        }
    }
}
