public class shortPath {

    public static int sortPath(String str) {

        int len= str.length();
        int M=0;
        int N=0;

        for(int i=0;i<len;i++){

            if(str.charAt(i)=='W'){     //string -> ""
                M-=1;                   // char -> ''
            }else if(str.charAt(i)=='N'){
                N+=1;

            }else if(str.charAt(i)=='E'){
                M+=1;

            }else{
                N-=1;

            }
        }

        int  sq=((M-0)*M)+((N-0)*N);

        return (int)Math.sqrt(sq);


        
    }

    public static void main(String[] args) {
        
        String str="WNEENESENNN";
        // sortPath(str);
        System.out.println(sortPath(str));

    }

    
}
