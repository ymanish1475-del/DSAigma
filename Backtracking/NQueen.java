// package Backtracking;

public class NQueen {

    static int count =0;

    public static void printBoard(char chessBoard[][]) {

        System.out.println("----------chessBoard---------");

        for(int i=0;i<chessBoard.length;i++){
            for(int j=0;j<chessBoard.length;j++){
                System.out.print(chessBoard[i][j]);
            
            }
            System.out.println();
            
        }
        
    }

    public static boolean isSafe(char chessBoard[][],int row,int col) {
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(chessBoard[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(chessBoard[i][j]=='Q'){
                return false;
            }
        }

        // diagonal right up
        for(int i=row-1,j=col+1;i>=0&&j<chessBoard.length;i--,j++){
            if(chessBoard[i][j]=='Q'){
                return  false;
            }
        }

        return true;
        
    }

    public static boolean nQueen(char chessBoard[][] , int row) {

        if(row==chessBoard.length){
            printBoard(chessBoard);
            count++;
            return true;
        }

        for(int j=0;j<chessBoard.length;j++){

            if(isSafe(chessBoard,row,j)){
                 chessBoard[row][j]='Q';
                 if(nQueen(chessBoard, row+1)){
                    return true;
                 }
                
                chessBoard[row][j]='.';
            }
           
        }

        return false ;
        
    }

    public static void main(String[] args) {
        int n=4;

        char chessBoard[][]=new char[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                chessBoard[i][j]='.';
            }
        }

        

        if(nQueen(chessBoard, 0)){

            System.out.println("'solution is posible'");
            nQueen(chessBoard, 0);
        }else{
            System.out.println("solution is not possibles");
        }
        System.out.println(count);
    }
    
}
