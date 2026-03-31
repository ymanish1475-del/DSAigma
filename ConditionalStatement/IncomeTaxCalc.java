import java.util.Scanner;

public class IncomeTaxCalc {
    public static void main(String [] args){

        Scanner s= new Scanner(System.in);

            System.out.print("ENTER INCOME = ");
            int income = s.nextInt();

            if(income<500000){

                System.out.println("0% TAX");
                System.out.println("TAX = " + "0 rupi");
                System.out.println("TOTAL="+ income );

            }else if(income>=500000 && income <= 1000000){

                System.out.println("20% TAX");
                System.out.println("TAX = " + income*20/100);
                System.out.println("TOTAL="+ (income+income*20/100) );

            }else if(income >1000000){

                System.out.println("30% TAX");
                System.out.println("TAX = " + income*30/100);
                System.out.println("TOTAL="+ (income+income*30/100) );

            }



        
    }
    
}
