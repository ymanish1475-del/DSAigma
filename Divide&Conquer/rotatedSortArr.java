public class rotatedSortArr {
    public static int roSoAr(int arr[],int tar,int si,int ei){

        if(si>ei){
            return -1;
        }

       int mid=(si+ei)/2;

       if(arr[mid]==tar){
        return mid;
       }

       if(arr[si]<=arr[mid]){
            if(arr[si]>=tar &&arr[mid]<tar){
                return roSoAr(arr, tar, si, mid-1);
            }else{
                return roSoAr(arr, tar, mid+1, ei);

            }
       }
       else{
            if(arr[mid]<tar&&arr[ei]>=tar){
                return roSoAr(arr, tar, mid+1, ei);
            }else{
                return roSoAr(arr, tar, si, mid-1);
            }

       }
    }
    public static int  sort(int arr[],int tar) {
          
        int mid=(arr.length)/2;

        if(tar==arr[mid]){
            return mid;
        }
        else if(arr[0]>tar && tar<arr[mid]){
            for(int i=0;i<mid;i++){
                if(arr[i]==tar){
                    return i;
                }
            }
        }else{
            for(int i=mid+1;i<arr.length;i++){
                return i;
            }
        }

        return -1;
       
        
    }

    public static void main(String[] args) {
        int arr[]={6,7,8,9,2,3,4,5};
        int tar=3;

        // int ans = sort(arr,  tar);
        int ans=roSoAr(arr, tar, 0, arr.length-1);
        System.out.println(ans);
    }
    
}
