package striver_sheet.array1.stock_and_buy;

public class Naive2 {
    static int findProfit(int[] prices){
        int ans =0;
        for(int i=0; i< prices.length; i++){
            int curr =prices[i];
            for(int j = i+1; j<prices.length; j++){
                ans = Math.max(ans, prices[j] - curr);
            }
        }
        return ans;
    }
    public static void main(String[] args) {

        int[] arr = {2,4,1};
        System.out.println(findProfit(arr));
    }
}
