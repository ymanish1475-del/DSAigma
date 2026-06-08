public class stringLinearSearch {

    public static void linearSearch(String menu[],String key){
        int len=menu.length;
        for(int i=0;i<len;i++){
            if(key==menu[i]){
                System.out.println( key+" is found in index - "+i);
            }
            
        }
    }
    
    public static void main(String[] args) {
        String menu[]={"samosa","kachori","fulki","aaloo-chat","poha","chai"};
        String key="samosa";

        linearSearch(menu, key);

    }
}
