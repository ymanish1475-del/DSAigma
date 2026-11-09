public class quikSort {

    public static void merge(int arr[],int si,int ei) {

        

        if(si>=ei){
            return;
        }

       int pIdx= partition(arr, si, ei);
       merge(arr,si,pIdx-1);
       merge(arr,pIdx+1,ei);
        
    }

    public static int partition(int arr[],int si,int ei) {

        int pivot=arr[ei];
        int i=si-1;

        for(int j=si;j<ei;j++){
            
            if(arr[j]<=pivot){
                i++;

                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;

            }
            

        }
        i++;

        int temp=pivot;
        arr[ei]=arr[i] ;
        arr[i] =temp;

        return i;


        
    }
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {

        int arr[]={2,9,3,9,5,3,7,0,8,5,2,3,7,9};

        merge(arr,0,arr.length-1);
        print(arr);


        
    }
    
}
