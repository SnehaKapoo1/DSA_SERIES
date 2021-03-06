package recursion.SimpleRecur;

public class NumOfStepsToMakeZero {
    public static int numberOfSteps(int num) {

        return countSteps(num, 0);
    }

    static int countSteps(int n, int steps){
        if(n == 0){
            return steps;
        }
        if(n % 2 == 0){
            return countSteps(n/2, steps+1);
        }
        return countSteps(n-1, steps+1);
    }

    public static void main(String[] args){
        System.out.println( numberOfSteps(14));
        System.out.println( numberOfSteps(123));
        System.out.println( numberOfSteps(41));
    }
}

/* Example: 1
Input: num = 14
        Output: 6
        Explanation:
        Step 1) 14 is even; divide by 2 and obtain 7.
        Step 2) 7 is odd; subtract 1 and obtain 6.
        Step 3) 6 is even; divide by 2 and obtain 3.
        Step 4) 3 is odd; subtract 1 and obtain 2.
        Step 5) 2 is even; divide by 2 and obtain 1.
        Step 6) 1 is odd; subtract 1 and obtain 0.*/

/*
Example: 2
Input: num = 8
        Output: 4
        Explanation:
        Step 1) 8 is even; divide by 2 and obtain 4.
        Step 2) 4 is even; divide by 2 and obtain 2.
        Step 3) 2 is even; divide by 2 and obtain 1.
        Step 4) 1 is odd; subtract 1 and obtain 0.
*/
