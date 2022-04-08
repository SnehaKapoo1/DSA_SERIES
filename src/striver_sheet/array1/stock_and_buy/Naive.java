package striver_sheet.array1.stock_and_buy;

import java.util.Arrays;

//it will not work on int[] arr = {2,4,1}; this type of input

public class Naive {
    static int findProfit(int[] prices){
        int buy = prices[0];
        int buyInd =0;
        for(int i =1; i<prices.length; i++){
            if(prices[i] < buy){
                buy = prices[i];
                buyInd = i;
            }
        }

        int shellMain =0;
        if(buyInd < prices.length-1){
            int shellInd = buyInd + 1;
            int shell = prices[buyInd+1];
            for(int i =buyInd + 1; i<prices.length; i++){
                if(prices[i] > shell){
                    shell = prices[i];
                    shellInd = i;
                }
            }
            shellMain = shell;

        }else return 0;

       return shellMain - buy;
    }
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};
        System.out.println(findProfit(arr));
    }
}
