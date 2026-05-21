public class Qs5sumOfInteger {

    public static void sumofNum(int num) {

        int mod=0;
        int sum=0;

        while(num>0){
            mod=num%10;
            sum=sum+mod;
            num=num/10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int num=16473826;

        sumofNum(num);
    }
    
}
