import java.util.Scanner;

public class AssPractice {
    public static void main(String [] args){
// qs 1
        // for(int i=0;i<5;i++){
        //     System.out.println("hellooo");
        //     i+=2;
        // }

        Scanner sc= new Scanner(System.in);
        int even=0;
        int odd=0;
        int resultOdd=0;
        int resultEven=0;

        for (int i=0;i<6;i++){
            int a= sc.nextInt();

            if(a%2==0){
                even=even+a;
                resultEven=even;
                
            }else{
                odd=odd+a;
                
                resultOdd=odd;
            }
        }
        System.out.println("sum of odd = "+resultOdd);
        System.out.println("sumof even = "+resultEven);



    }

    
}
