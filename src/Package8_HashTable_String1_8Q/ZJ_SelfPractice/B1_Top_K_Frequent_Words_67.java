package Package8_HashTable_String1_8Q.ZJ_SelfPractice;

import java.util.*;

public class B1_Top_K_Frequent_Words_67 {
    public static void main(String[] args){
        String[]abc={"a","a","b","b","b","b","c","c","c","d"};
        System.out.println(Arrays.toString(abc));
        String[]top=topKFrequent(abc,2);
        System.out.println(Arrays.toString(top));
    }
    public static String[] topKFrequent(String[] letters,int k){
        if(letters.length==0){
            return new String[0];
        }
        Map<String,Integer>freqMap=getFreqMap(letters);
        PriorityQueue<Map.Entry<String,Integer>>minHeap=new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        return new String[0];

    }

    private static Map<String, Integer> getFreqMap(String[] letters) {  //
        Map<String,Integer>freqMap=new HashMap<>();

        return null;
    }

}
