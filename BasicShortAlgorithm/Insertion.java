public class Insertion {

    public static int [] Insertion(int num[] ) {

        int len= num.length;

        for(int i=1;i<len;i++){

           int curr=num[i];
           int prev=i-1;

           while(prev>=0 && num[prev]>curr){

            num[prev+1]=num[prev];
            prev--;
           }
           num[prev+1]=curr;
        //    if(num[prev]>num[curr]){

        //     int temp=num[curr];
        //     num[curr]=num[prev];
        //     num[prev]=temp;

        //    }
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
