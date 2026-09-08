public class Compression {

    public static String compression(String str) {

        int len = str.length();

        StringBuilder sb= new StringBuilder();
        int counter =1;

        for(int i=1;i<len;i++){
           
            if(str.charAt(i)!=str.charAt(i-1)){
                sb.append(str.charAt(i-1));

                if(counter>1){
                     sb.append(counter);
                }
               
                counter=1;
            }else{
                counter++;
            }

            //  sb.append(str.charAt(i));

        }
        sb.append(str.charAt(len-1));
        if(counter>1){
                     sb.append(counter);
                }
        // sb.append(counter);

      

           
        return sb.toString();


        
    }

    public static void main(String[] args) {
        
        String str="aaaabbbccddddeeeefff";
        // String str="abc";

        System.out.println(compression(str));


    }
    
}
