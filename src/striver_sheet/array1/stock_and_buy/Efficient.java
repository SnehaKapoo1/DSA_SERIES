package striver_sheet.array1.stock_and_buy;

public class Efficient {
    static int findProfit(int[] prices){
        int maxProfit =0;
        int minBuyPrice = Integer.MAX_VALUE;
        for(int i=0; i<prices.length; i++){
            minBuyPrice = Math.min(minBuyPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minBuyPrice );
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        int[] arr2 = {2, 4, 1};
        int arr3[] = {7, 6, 3, 4, 1};
        int[] arr4= {7,6,4,3,1};
        System.out.println(findProfit(arr));
        System.out.println(findProfit(arr2));
        System.out.println(findProfit(arr3));
        System.out.println(findProfit(arr4));
    }
}
