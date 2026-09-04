public class subString {

    public static String subString(String str, int st,int en) {
        String substring="";

        for(int i=st;i<en;i++){
            substring +=str.charAt(i);
        }

        return substring;
        
    }
    public static void main(String[] args) {
        String str="hello world";

        int st=0;
        int en=5;

        // System.out.println(subString(str, st, en));
        System.out.println(str.substring(0,8));




    }
}
