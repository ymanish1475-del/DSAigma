public class countingSort {

    public static void countingSort( int arr [] ) {
        int len=arr.length;

        int maxValue=Integer.MIN_VALUE;

        for(int i=0;i<len;i++){

            maxValue=Math.max(maxValue, arr[i]);
        }

        int count[]= new int[maxValue+1];

        for(int i=0;i<len;i++){

            count[arr[i]]++;
        }

        int j=0;

        for(int i=0;i<count.length;i++){

            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void print(int arr[] ) {

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void main(String[] args) {
        int arr[]={1,4,2,6,2,7,9,5};
        countingSort(arr);
        print(arr);
        
    }
    
}
