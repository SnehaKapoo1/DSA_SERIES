package leetcode_ques.searching_sorting;

public class BuyAndSell {
    static int maxProfit(int[] prices){

        int n = prices.length;
        int soFarMin = prices[0];
        int profit =0;

        if(n==0) return 0;
        else{
            for(int i=1; i<n; i++){
                if(prices[i] > soFarMin){
                  profit = Math.max(profit, prices[i] - soFarMin);
                }else{
                    soFarMin = prices[i];
                }
            }
        }
        return profit;
    }
    public static void main(String args[])
    {
        int arr[] = {1,5,3,8,12}, n = arr.length;

        System.out.println(maxProfit(arr));

    }
}
