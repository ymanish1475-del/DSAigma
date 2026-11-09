
import java.lang.StringBuilder;

public class removeDupString {

    public static void remoString(String s,int idx,boolean map[],StringBuilder sb) {

       
        if(idx==s.length()){
            System.out.println(sb);
            return;
        }

        char currChar=s.charAt(idx);

        if(map[currChar-'a']==true){
            remoString(s, idx+1, map,sb);
        }else{

            map[currChar-'a']=true;
             
            remoString(s, idx+1, map,sb.append(currChar));
        }
        
        
    }

    public static void main(String[] args) {
        String s="helllomanishyadav";
         StringBuilder sb= new StringBuilder();


        remoString(s, 0, new boolean[26],sb);
    }
    
}
