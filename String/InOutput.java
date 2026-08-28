import java.util.Scanner;

public class InOutput {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // String name= sc.nextLine();

        // System.out.println(name)
        // ;
        // String name ="Tony Stark";

        // System.out.println(name.length());
        String name="steve " ;
        String surname ="rodger";

        String fullname=name+" "+surname;
        System.out.println(fullname);

        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }


    }
    
}
