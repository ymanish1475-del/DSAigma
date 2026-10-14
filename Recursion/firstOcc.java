public class firstOcc {

    public static int  firstOcc(int arr[],int key,int i ) {

        if(arr[i]==key){
            return i;
        }else if (i==arr.length-1) {
            return -1;
        }

        return firstOcc(arr, key, i+1);
        
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,5,6,7,8,9};

        int ans = firstOcc(arr, 9, 0);

        System.out.println(ans);


    }
}
