public class largestString {

    public static String largString(String[] str) {

        String large=str[0];

        // for(int i=0;i<str.length;i++){
        //     for(int j=0;j<str[i].length();j++){
        //         if(str[i].charAt(j)>large.charAt(j) ||str[i].length()> large.length()){
        //             large=str[i];
        //         }
        //     }
        // }

        // return large;

        for(int i=1;i<str.length;i++){
            if(str[i].compareTo(large)>0){     // 0 -> ==
                large=str[i];                  // -1 -> str<str2
            }                                  // +1 -> str>str2
        }

        return large;


        
    }

    public static void main(String[] args) {

        String [] str={"apple","banana","mango","mangoe","mangoz","A"};

        
        System.out.println(largString(str));
        
    }
    
}
