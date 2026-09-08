public class Qs4 {

    public static String uppercase(String str) {

        int len= str.length();
        StringBuilder sb= new StringBuilder();

        char ch= Character.toUpperCase(str.charAt(0));

        sb.append(ch);

        for(int i=1;i<len;i++){

            if(str.charAt(i)==' ' && i<len-1){

                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
                

            }else{
                
                sb.append(str.charAt(i));
            }
        }

        // System.out.println(sb);
        return sb.toString();

        


        
    }

    public static void main(String[] args) {
        String str= "hi , i am manish yadav";

        System.out.println(uppercase(str));

    }
    
}
