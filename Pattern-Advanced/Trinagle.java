public class Trinagle {

    public static void triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if((i+1)%(j)==0 ){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n=5;
        triangle(n);

        
    }
}
