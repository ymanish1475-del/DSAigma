public class binomialCoefficient {

    static int factorial( int n){
        int fact=1;
        //  if(n==1) return 1;



        
            for(int i=1;i<=n;i++){
             fact= fact*i;
        
        // System.out.println("fact= "+fact);

        }
        return fact;
    }

    static int binCoefficient(int n,int r){

        int fact_n= factorial(n);
        int fact_r= factorial(r);
        int fact_nmr= factorial(n-r);

        int binCoeff= fact_n/(fact_r*fact_nmr);

        return binCoeff;

        // int fact=1;

        // for(int i=1;i<=n;i++){
        //     fact=fact*i;
        // }
        // return fact;

    }

    public static void main(String[] args) {

        int n=10;
        int r=4;


        System.out.println(binCoefficient(n, r));
        
    }
    
}
