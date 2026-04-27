public class swap {

    static void swap(int a , int b){

        int temp=a;
         a=b;
         b=temp;
        System.out.println("a= "+a);
        System.out.println("b= "+b);

    }

    public static void main(String[] args) {
        
        int a= 78;
        int b=85;
        swap(a,b);  //cal by value

        // int temp=a;
        //  a=b;
        //  b=temp;
        // System.out.println("a= "+a);
        // System.out.println("b= "+b); 

        //without function...

        

    }
    
}
