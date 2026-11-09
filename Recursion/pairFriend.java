public class pairFriend {

    public static int  pairFriendinParty(int n) {

        if(n==2||n==1){
            return n;
        }

        return pairFriendinParty(n-1)+pairFriendinParty(n-1)*pairFriendinParty(n-2);
        
    }

    public static void main(String[] args) {

        int ans = pairFriendinParty(3);

        System.out.println(ans);
        
    }
    
}
