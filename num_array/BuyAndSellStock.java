package num_array;

// buy at one day sell at next any day to gain maximum profit
// Given : array of prices of consecutie days
// constraint : can't sell yesterday if he buy today 

public class BuyAndSellStock {
    public static void main(String[] args) {
        int[] arr = {1,2,0,10,5,6};
        int buy=arr[0],sell=0;
        for(int price:arr){
            if(price<buy){
                buy = price;
            }
            else{
                int curr_sell = price-buy;
                if(curr_sell>sell){
                    sell = curr_sell;
                }
            }
        }
        System.out.print(sell);
    }
    
}
