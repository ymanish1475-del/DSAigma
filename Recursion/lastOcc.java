public class lastOcc {

    public static int  lastOcc(int arr[],int key ,int i) {

        if(i==arr.length){
            
        }
        int last = lastOcc(arr, key, i+1);



        // if(i==-1){
        //     return -1;
        // }
        // if(arr[i]==key){
        //     return i;
        // }

        // return lastOcc(arr, key, i-1);



        }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,0,8,6,5,3,2,4,};

        int ans = lastOcc(arr, 4, arr.length-1);
        System.out.println(ans );


    }
    
}
