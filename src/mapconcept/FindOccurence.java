package mapconcept;

import java.util.HashMap;
import java.util.Map;

public class FindOccurence {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 4, 5};
        findOccurence(numbers);
    }

    public static void findOccurence(int[] numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        //run loop
        //create hashmap
        for (int num : numbers) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        //printing val

        for (int key : map.keySet()) {
//            if (entry.getValue()>1 && entry.getKey() %2==0) {
//                System.out.println(entry.getKey());
//            }
            System.out.println(key);
        }
            for(int val :map.values())
            {
                System.out.println(val);
            }

        }



    }

