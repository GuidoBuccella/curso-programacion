package colecciones;

import java.util.Arrays;
import java.util.*;

public class HowManyTimeIsRepeated {

    public static <T> Map<T,Integer> countRepetition(T [] array) {

        Map<T, Integer> animalMap = new LinkedHashMap<T,Integer>();

        for (int i = 0; i < array.length; i++) {

            if (animalMap.containsKey(array[i])) {
                animalMap.put(array[i], animalMap.get(array[i]) + 1);

            } else animalMap.put(array[i], 1);
        }
        System.out.println(animalMap);
        //1. get entrySet from LinkedHashMap object
        Set<Map.Entry<T, Integer>> entrySet = animalMap.entrySet();
        // 2. convert LinkedHashMap to List of Map.Entry
        List<Map.Entry<T, Integer>> entryList = new ArrayList<Map.Entry<T, Integer>>(entrySet);
        // 3. sort list of entries using Collections class'// utility method sort(ls, cmptr)

        Collections.sort(entryList, new Comparator<Map.Entry<T, Integer>>() {

                    @Override
                    public int compare(Map.Entry<T, Integer> o1, Map.Entry<T, Integer> o2) {
                        return o2.getValue().compareTo(o1.getValue());
                    }
        });

        // 4. clear original LinkedHashMap
        animalMap.clear();

        // 5. iterating list and storing in LinkedHahsMap
        for(Map.Entry<T, Integer> entry : entryList){

            animalMap.put(entry.getKey(), entry.getValue());
        }
        return animalMap;
        /*
        System.out.println("\n\nSorted LinkedHashMap by its Values"
                + " in descending-order\n");

        // 6. iterate LinkedHashMap to retrieved stored values
        for(Map.Entry<String, Integer> lhmap : animalMap.entrySet()){
            
            System.out.println("Key : "  + lhmap.getKey()
                    + "\t\t" + "Value : "  + lhmap.getValue());
        }*/
    }
}
