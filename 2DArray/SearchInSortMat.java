import java.util.Scanner;

public class SearchInSortMat {
    public static void SearchInSortMat(int mat[][], int key ) {

        int len= mat.length;

        

        // for(int i=0;i<len;i++){
        //     for(int j=0;j<len;j++){
        //         if(mat[i][j]==key){
        //             System.out.println(i+" "+j);
        //         }
        //     }
        // }

        if(key == mat[0][0]){
            System.out.println(00);
        }

        for(int i=1;i<len;i++){
            if(mat[0][1]==key){
                System.out.println(0+" "+1);
            }else if(key <mat[0][i+1]){
                for(int j=1;j<len;j++){
                    if(key == mat[i][j]){
                        System.out.println(i+" "+j);
                    }
                }
            }
        }

        // int key =37;

        // for(int i=0;i<mat.length;i++){
        //     if(key==mat[0][0]){
        //         // return (0,0);
        //         System.out.println(0+" " +0);

        //     }else if(key>mat[i][0]){
        //         for(int j=1;j<mat.length;j++){
        //             if(key==mat[i][j]){
        //                 // return (i,j);
        //                 System.out.println(i+" "+j);
        //             }
        //         }
        //     }
        // }
        
    }

    public static void stairCase(int mat[][], int key) {
        int len= mat.length;

        int row=0, col=len-1;

        while(row <len && col>=0){
            if(key==mat[row][col]){
                System.out.println(row+" "+col);
                break;
            }else if(key<mat[row][col]){
                col--;
            }else if(key>mat[row][col]){
                row++;
            }
        }



        
    }
    public static void main(String[] args) {
        int mat[][]={{10,20,30,40},{15,25,35,45},{17,27,37,47},{22,32,42,52}};
        // System.out.println(SearchInSortMat(mat));

        Scanner sc= new Scanner(System.in);
        System.out.print("enter key :->");
        int key=sc.nextInt();
        // SearchInSortMat(mat,key);
        stairCase(mat, key);


    }
}
