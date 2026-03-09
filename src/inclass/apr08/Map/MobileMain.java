package inclass.apr08.Map;

import java.util.*;

public class MobileMain {
    static void main(String[] args) {

        Map<String, Integer > map = new HashMap();
        map.put("null", 2);
        map.put("null", null);
        map.put("nokia", 4);
        map.put("samsung", 1);
        map.put("redme", 4);
        map.put("ihphone", 5);
        System.out.println("hashmap sorting : " + map);

        Map<String, Integer > treeMap = new TreeMap<>();
        treeMap.put("null", 2);
        treeMap.put("null", null);
        treeMap.put("nokia", 4);
        treeMap.put("samsung", 1);
        treeMap.put("redme", 4);
        treeMap.put("ihphone", 5);
        System.out.println("treemap sorting : " + treeMap);

        Map<String, Integer > linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("null", 2);
        linkedHashMap.put("null", null);
        linkedHashMap.put("nokia", 4);
        linkedHashMap.put("samsung", 1);
        linkedHashMap.put("redme", 4);
        linkedHashMap.put("iphone", 5);
        linkedHashMap.put("iphone", 1);
        System.out.println("linkedhashmap   : " + linkedHashMap);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(" practice other methods ");
        Integer samsung = linkedHashMap.getOrDefault("samsung", 2);
        System.out.println("occurrence of samsung : " + samsung);
        Integer iphone = linkedHashMap.get("iphone");
        System.out.println("occurrence of iphone : " + iphone);
        System.out.println();
        System.out.println();

        Set<Map.Entry<String, Integer>> entrySet = linkedHashMap.entrySet();

        System.out.println("set of entry set : " + entrySet);
        Collection<Integer> values = linkedHashMap.values();
        System.out.println("collection of integer values : " + values);
        Set<String> keySet = linkedHashMap.keySet();
        System.out.println("set of key : " + keySet);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) { ///  came from
            /*System.out.println(entry.getKey());*/
            System.out.println(entry.getValue());

        }

    }
}
