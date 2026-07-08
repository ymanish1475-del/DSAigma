public class SelectionSort {

    public static int [] SelectionSort(int arr[] ) {

        int len= arr.length;
        

        for(int i=0;i<len;i++){
            int chotu=i;

            

            for(int j=i+1;j<len;j++){
                if(arr[chotu]>arr[j]){
                    chotu=j;
                    
                }
            }
            int temp =arr[chotu];
            arr[chotu]=arr[i];
            arr[i]=temp;
            
        }

        return arr;


        
    }
    public static void main(String[] args) {
        int arr[]={4,8,7,9,3,5,2,6,1};

        int sort[]=SelectionSort(arr);

        for(int i=0;i<sort.length;i++){
            System.out.print(" "+sort[i]);
        }
    }
}
