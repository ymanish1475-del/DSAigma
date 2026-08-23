// package 2DArray;

public class SpriralMatrix {

    public static void spiral(int matrix[][],int len){

        int n=len;

        int startRow=0;
        int endRow=n-1;
        int startCol=0;
        int endCol=n-1;

        while(startRow<=endRow && startCol<=endCol){
            // for(int i=startRow; i<endRow;i++){

            // }
            for(int j=startCol; j<=endCol;j++){
                System.out.print(matrix[startRow][j]+" ");
            }
            // System.out.println("||");

            for(int j=(startRow+1);j<=endRow;j++){
                System.out.print(matrix[j][endCol]+" ");
            }
            // System.out.println("||");

            for(int j=(endCol-1);j>=startCol;j--){
                System.out.print(matrix[endRow][j]+" ");
            }
            // System.out.println("||");

            for(int j=(endRow-1);j>startRow;j--){
                System.out.print(matrix[j][startCol]+" ");
            }
            // System.out.println("||");

            startRow++;
            endCol--;
            startCol++;
            endRow--;

        }

        // for(int i=startRow;i<=endRow;i++){
        //     for(int j=endRow;j>=startCol;j--){
        //         if(i==startRow||j==startCol){
        //             System.out.print(matrix[i][j]);
        //         }
        //         if(j==endRow){
        //             System.out.print(matrix[j]);
        //         }

        //     }
        // }

    }

    public static void main(String[] args) {
        
        int  matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int len=matrix.length;

        spiral(matrix,len);

        // for(int i=0;i<4;i++){
        //     for(int j=0;j<4;j++){
        //         if(i==0 || j==3){
        //             System.out.print(matrix[i][j]+" ");
        //         }
        //     }
        // }
    }
    
}
