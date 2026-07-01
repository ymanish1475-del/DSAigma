public class BuySellStock {

    public static void BuySellStock(int [] arr) {

        int maxProfit= 0;
        int buyStock=Integer.MAX_VALUE;
        int sellStock=0;

        int len= arr.length;

        for(int i=0;i<len;i++){
            int profit=0;

            if(buyStock<arr[i]){
                profit=arr[i]-buyStock;

                if(profit>maxProfit){
                    maxProfit=profit;
                }
            }
            else{
                buyStock=arr[i];
            }
           
        }
        System.out.println();
        
    
        System.out.println(maxProfit);

        
    }


    public static void main(String[] args) {

        int arr[]={7,1,5,3,6,41};
        BuySellStock(arr);
        
    }
}
