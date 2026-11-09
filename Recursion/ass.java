public class ass {

    public static void qs1(int arr[],int key,int idx) {

        if(idx==arr.length){
            return;
        }

        if(arr[idx]==key){
            System.out.print(idx+" ");
           
        }
             qs1(arr, key, idx+1);

        

       
        
    }

    public static void qs2(int n) {
        
    }
    public static void main(String[] args) {
        int arr[]={3,2,4,5,2,6,2,6,5,7,8,3,2,3,2};

        int key=2;

        // qs1(arr, key, 0);

        int n = 1947;
        qs2(n);

    }
}
