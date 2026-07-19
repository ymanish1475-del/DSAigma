
import java.util.*;
public class InbuiltSort {
    public static void write(Integer arr[] ) {

        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        
    }

    public static void main(String[] args) {
        Integer arr[]={9,8,7,6,5,7,3,8,1};

        Arrays.sort(arr,0,5,Collections.reverseOrder());
        write(arr);


    }
    
}
