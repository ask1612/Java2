package yandex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author ASK
 *
 */
public class Sort {

    private final String strYandex
            = "Day Night  Night  Night  Night  Night Day Day Monday Day YandexTest";//An example of the  string
    private final HashMap<String, Integer> wordMap = new HashMap<>();

    public Sort() {
    }

    /**
     * getMap
     *
     * @return
     */
    public HashMap getMap() {
        String[] testYandex = strYandex.trim().split("\\s+");//Get the words of the string
        for (String testYandex1 : testYandex) {
            Integer count = wordMap.get(testYandex1);
            wordMap.put(testYandex1, (count == null) ? 1 : count + 1);//Put counter of a word
        }

        return wordMap;
    }

    /**
     * getComparator
     *
     * @return
     */
//A versin using Comparator 
    public Entry<String, Integer> getComparator() {
        ArrayList<Entry<String, Integer>> mapOrdered = new ArrayList<>();
        mapOrdered.addAll(wordMap.entrySet());
        mapOrdered.sort(new EntryComparator());
        return mapOrdered.get(mapOrdered.size() - 1);
        
    }
/**
 * getSortBuble
 * @return 
 */
//A simple version of bubble sort
    public Entry<String, Integer> getSortBuble() {
        ArrayList<Entry<String, Integer>> mapOrdered = new ArrayList<>();
        mapOrdered.addAll(wordMap.entrySet());
        Entry<String, Integer> word=mapOrdered.get(0);
        for(int i=1;i<mapOrdered.size();i++){
            if(mapOrdered.get(i).getValue()>word.getValue()){
                word=mapOrdered.get(i);
            }
        }
    return word;    
    }

}
