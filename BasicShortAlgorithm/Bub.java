// package BasicShortAlgorithm;

public class Bub {

    public static void main(String[] args) {
        int num[]={2,4,6,5,3,8,9};

        int len = num.length;

        for(int i=0;i<len;i++){
            if(num[i]>num[i+1]){
                int temp=num[i];
                num[i]=num[i+1];
                num[i+1]=temp;
            }
        }
    
}


}
