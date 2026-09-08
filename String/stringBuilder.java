public class stringBuilder {

    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder();

        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        // console.log(sb);
        System.out.println(sb);
    }
    
}
