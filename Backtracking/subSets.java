// package Backtracking;

public class subSets {

    public static void subSet(String str,String ans,int i) {

        if(i==str.length()){
                System.err.println(ans);
                return;
        }

        subSet(str, ans+str.charAt(i), i+1);
        subSet(str, ans, i+1);
        
    }
    public static void main(String[] args) {
         String str ="abc";
         subSet(str,"",0);
    }
}
