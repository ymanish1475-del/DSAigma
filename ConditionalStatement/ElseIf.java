import java.util.*;
public class ElseIf {
    public static void main(String [] args){

        Scanner s= new Scanner(System.in);

        System.out.print("mark=" );
        int mark =  s.nextInt();
        

        if( mark < 0 || mark>100){
            System.out.println("Fill Correctly");
        }
        else if( mark >=90 &&mark <=100){
            System.out.println("A Grade");
        }
        else if( mark >=80 &&mark <=89){
            System.out.println("B Grade");
        }
        else if( mark >=70 &&mark <=79){
            System.out.println("C Grade");
        }
        else if( mark >=60 &&mark <=69){
            System.out.println("D Grade");
        }
        else{
            System.out.println("Fail");
        }

    }
}
