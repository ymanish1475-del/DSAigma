import java.util.Arrays;

public class pracQs {

    public static int  countVowel(String str) {

        int count =0;
        int len= str.length();

        for(int i=0;i<len;i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }

        }

        return count;
        
    }
    public static void anagram(String str1,String str2) {

        int len=str1.length();

        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

       if(len==str2.length()){

            char [] strOne= str1.toCharArray();
            char [] strTwo= str2.toCharArray();

            Arrays.sort(strOne);
            Arrays.sort(strTwo);

            boolean result = Arrays.equals(strOne, strTwo);

            System.out.println(result);

            if(result){
                System.out.println("enagram");
            }else{
                System.out.println(" na enagram to nahi hea");
            }


       }else{
        System.out.println("na enagram to nahi hea");
       }
        
    }

    public static void main(String[] args) {

        String str="Abcdioengshrsjsydhiecaze";

        // System.out.println(countVowel(str));

        String str1="abdc";
        String str2="bcad";

        // System.out.println(str1.length()+" "+str2.length());

        // System.out.println();
        anagram(str1, str2);
        




        
    }
    
}
