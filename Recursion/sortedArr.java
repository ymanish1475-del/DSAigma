public class sortedArr {

    public static boolean sortedArr(int arr[],int i) {

        if(i==arr.length-1){
            return true;
        }

        if(arr[i]>arr[i+1]){
            return false;
        }

        return sortedArr(arr,i+1);

        // int len= arr.length;
    

        // for(int i=0;i<len-1;i++){

        //     if(arr[i]>arr[i+1]){
        //         return false;
        //     }
        // }

        // return true;
        
    }

    public static void main(String[] args) {
        int arr[]={8,2,3,4,5,6,7,8,9};

        boolean ans = sortedArr(arr,0);    //i = whichh ith index to start for test sorting 
        System.out.println(ans);
    }
    
}
