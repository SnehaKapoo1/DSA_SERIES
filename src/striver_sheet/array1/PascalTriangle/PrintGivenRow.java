package striver_sheet.array1.PascalTriangle;

import java.util.ArrayList;
import java.util.List;

public class PrintGivenRow {

    public static List<Integer> findRow(int rowIndex){
        List<Integer> ans = new ArrayList<>();
        for(int i =0; i<= rowIndex; i++){
            ans.add(nCr(rowIndex, i));
        }
        return ans;
    }

    public static int nCr(int n, int r){
        long res =1;
        r = Math.min(r, n-r);
        for(int i=1; i<=r; i++){
            res = res * (n - i + 1)/i;
        }
        return (int) res;
    }

    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(findRow(rowIndex));
    }
}
