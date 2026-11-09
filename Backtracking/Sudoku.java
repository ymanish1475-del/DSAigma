// package Backtracking;

public class Sudoku {

    public static boolean isSafe(int [][]sudoku, int row,int col,int i) {

        //row
        for(int j=0;j<=8;j++){
            if(sudoku[j][col]==i){
                return false;
            }
        }
        //col
        for(int j=0;j<=8;j++){
            if(sudoku[row][j]==i){
                return false;
            }
        }
        //
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int k=sr;k<=sr+2;k++){
            for(int l=sc;l<=sc+2;l++){
                if(sudoku[k][l]==i){
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean sudokuSolver(int [][] sudoku,int row ,int col) {

        //basecase 

        if(row==9&&col==0){
            return true;
        }

        //recursion

        int nextRow=row  ;
        int nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            col=0;
        }

        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int i=1;i<=9;i++){
            if(isSafe(sudoku, row, col,i)){
                sudoku[row][col]=i;
                if(sudokuSolver(sudoku,nextRow,col)){
                    return true;
                }
                sudoku[row][col]=0;
                
            }
        }
        return false;
        
    }

    public static void print(int sudoku[][]) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
    
    int[][] sudoku = {
        {5, 3, 0, 0, 7, 0, 0, 0, 0},
        {6, 0, 0, 1, 9, 5, 0, 0, 0},
        {0, 9, 8, 0, 0, 0, 0, 6, 0},
        {8, 0, 0, 0, 6, 0, 0, 0, 3},
        {4, 0, 0, 8, 0, 3, 0, 0, 1},
        {7, 0, 0, 0, 2, 0, 0, 0, 6},
        {0, 6, 0, 0, 0, 0, 2, 8, 0},
        {0, 0, 0, 4, 1, 9, 0, 0, 5},
        {0, 0, 0, 0, 8, 0, 0, 7, 9}
    };   

    if(sudokuSolver(sudoku, 0, 0)){
        System.out.println("solution");
        print(sudoku);
    }else{
        System.out.println("solution is not exist");
    }
    }
}
