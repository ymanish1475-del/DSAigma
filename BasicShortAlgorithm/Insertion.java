public class Insertion {

    public static int [] Insertion(int num[] ) {

        int len= num.length;

        for(int i=1;i<len;i++){

            if(num[i-1]>num[i]){
                int temp =num[i];
                num[i-1]=num[i];
                num[i]=temp;
            }
        }
        return num;


        
    }
    public static void main(String[] args) {

        int num[]={3,1,5,2,4};
       int num2[]= Insertion(num);

       for(int i=0;i<num2.length;i++){
        System.out.print(num2[i]+",");
       }
        
    }
}
