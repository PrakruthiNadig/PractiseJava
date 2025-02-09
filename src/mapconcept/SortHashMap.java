package mapconcept;

import java.util.*;

public class SortHashMap {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 70);
        map.put("C", 50);

        Map<String, Integer> map1 = new TreeMap<>();
        map.put("Kittu", 67);
        map.put("Aram", 80);
        map.put("Holy", 23);
        System.out.println(map1);
        //sorting based on keys


        //put the map to list of type map<s,i>  inorder to sort
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());  //putting values into linkedhashmap
        }

        System.out.println(sortedMap);
    }

}
