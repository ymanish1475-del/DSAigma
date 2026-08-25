public class diagonalSum {

    public static void diagonalSum(int matrix[][]) {

        int len = matrix.length;
        int n= len;
        int sum=0;

        // for(int i=0;i<len;i++){
        //     for(int j=0;j<len;j++){
        //         if(i==j){
        //             sum+=matrix[i][j];
        //         }
        //         if(i+j==n-1){
        //             sum+=matrix[i][j];

        //         }
        //     }
        // }
        // System.out.println(sum);

        for(int i=0;i<len;i++){

            sum+=matrix[i][i];

            if(i!=len-i-1){
                sum+=matrix[i][len-i-1];
            }

           
        }
        System.out.println(sum);

        




        
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        diagonalSum(matrix);
        diagonalSum(mat);

    }
}
