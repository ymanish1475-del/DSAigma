import java.util.Scanner;

public class SearchInSortMat {
    public static void SearchInSortMat(int mat[][], int key ) {

        // int key =37;

        for(int i=0;i<mat.length;i++){
            if(key==mat[0][0]){
                // return (0,0);
                System.out.println(0+" " +0);

            }else if(key>mat[i][0]){
                for(int j=1;j<mat.length;j++){
                    if(key==mat[i][j]){
                        // return (i,j);
                        System.out.println(i+" "+j);
                    }
                }
            }
        }
        
    }
    public static void main(String[] args) {
        int mat[][]={{10,20,30,40},{15,25,35,45},{17,27,37,47},{22,32,42,52}};
        // System.out.println(SearchInSortMat(mat));

        Scanner sc= new Scanner(System.in);
        int key=sc.nextInt();
        SearchInSortMat(mat,key);


    }
}
