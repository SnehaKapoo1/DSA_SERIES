package questions.arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GroupOfNumbers {
    int[] group(int n, int[] arr){
        Map<Integer, Integer> mp = new HashMap<>();
        int[] res = {0};

        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        /*for(int i=0; i<mp.size(); i++){
            int freq = mp.
        }*/
        return res;
    }

}
