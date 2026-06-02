public class butterFly {

    public static void butterfly(int n) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
            

            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
                
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=5;
        butterfly(n);
    }
}
