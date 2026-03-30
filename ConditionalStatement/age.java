// package ConditionalStatement;

// import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class age {

    public static void main (String [] args){

        Scanner s = new Scanner(System.in);
        // System.out.print("your name=");

        // String name = s.nextLine();
       

        System.out.print("your age=");
        int age = s.nextInt();
        //  System.out.println("your name="+name);

        System.out.println("your age=" + age);

        if(age>0  && age<18){
            System.out.println("you are minor");
        }
        if(age>=18  && age<=80){
            System.out.println("you are an adult");
        }
        if(age>100){
            System.out.println("you are From MARVEL UNIVERSE");
        }
        


        


        


    }
    
}
