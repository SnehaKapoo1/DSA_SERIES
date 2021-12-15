package recursion.SubSequence;

import java.util.ArrayList;
import java.util.List;

public class NumberOfDiceRollsWithTargetSum {
    public static void main(String[] args) {

        diceRoll("", 4);
        System.out.println();
        List<String> ans = diceRetList("", 4);
        System.out.println(ans);

        System.out.println();
        diceRollFace("", 7, 8);
    }

    static void diceRoll(String p, int target){
        if(target == 0){
            System.out.print(p + " ");
            return;
        }
        for(int i=1; i<=6 && i <= target; i++){
            diceRoll(p + i, target - i);
        }
    }

    static List<String> diceRetList(String p, int target){
        List<String> list = new ArrayList<>();
        if(target == 0){
            list.add(p);
            return list;
        }
        for(int i=1; i<=6 && i <= target; i++){
            list.addAll(diceRetList(p + i, target - i));
        }
        return list;
    }

    // any face dice like 6 or 7 or 8
    static void diceRollFace(String p, int target, int face){
        if(target == 0){
            System.out.print(p + " ");
            return;
        }
        for(int i=1; i<=face && i <= target; i++){
            diceRollFace(p + i, target - i, face);
        }
    }

}
