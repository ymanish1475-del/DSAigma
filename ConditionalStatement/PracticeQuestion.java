import java.util.Scanner;

public class PracticeQuestion {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);
        // Q1 - CHECK POSITIVE NEGATIVE
        // System.out.print("enter a =");
        // int a = sc.nextInt();

        // if(a>0){
        //     System.out.println("a="+a+"is positive");
        // }
        // else if(a==0){
        //     System.out.println("a="+a+"is zero");
        // }
        // else{
        //     System.out.println("a="+a+"is negative");
        // }

        // Q2- CHECK FEVER
        // double temp = 103.5;

        // if(temp>100){
        //     System.out.println("YOU HAVE FEVER ");
        // }
        // else{
        //     System.out.println(" koi  dikkat nahi hea...");
        // }

        // Q3 WEEK DAY
        // System.out.print("enter day no. = ");
        // int a = sc.nextInt();

        // switch (a) {
        //     case 1 : System.out.println("MONDAY");
        //         break;

        //     case 2 : System.out.println("TUESDAY");
        //         break;

        //     case 3 : System.out.println("WEDNESDAY");
        //         break;

        //     case 4 : System.out.println("THURSDAY");
        //         break;

        //     case 5 : System.out.println("FRIDAY");
        //         break;

        //     case 6 : System.out.println("SATUREDAY");
        //         break;

        //     case 7 : System.out.println("SUNDAY");
        //         break;
        
        //     default:System.out.println("WRONG NO..");
        //         break;
        // }

        // LEAP YEAR
        System.out.print("KAUN SE  SAAL SE HO... = ");
        int a = sc.nextInt();
        if(a%4==0){
            System.out.println("ye to leap year hea ");
        }
        else{
            System.out.println("na");
        }




    }
    
}
