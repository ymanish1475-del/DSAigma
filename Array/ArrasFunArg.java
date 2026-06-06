public class ArrasFunArg {

    public static void update(int arr[]) {
        // System.out.println(arr);
        for(int i=0;i<=arr.length;i++){
            arr[i]=arr[i]+1;
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={78,98,78,67,56,3,45,36};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        update(arr);
    }
}
