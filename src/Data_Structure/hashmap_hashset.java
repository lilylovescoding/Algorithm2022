package Data_Structure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class hashmap_hashset {
    public static <Interator> void main(String[]args){
        HashSet<String> set = new HashSet<String>();
        set.add("AA");
        set.add("BB");
        set.add("CC");
        set.add("AA");

        System.out.println(set);

        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"AA");
        map.put(1,"BB");
        map.put(2,"CC");
        map.put(3,"CC");

        System.out.println(map.keySet());
        System.out.println(map.values()); //AA被覆盖了

        List<Integer> aa= new ArrayList<>(map.keySet());
        System.out.println(map.get(2));
        System.out.println(aa);
        System.out.println(map.entrySet());


        System.out.println(map);

        Set<Map.Entry<Integer,String>> map2 = map.entrySet();
        System.out.println(map2);
        for(Map.Entry<Integer,String>entry:map.entrySet()){
            System.out.println("key:"+entry.getValue()+",value:"+entry.getKey());
        }

        String[] a={"a","b","c","c"};
        String c=a[0];
        System.out.println(c);
        Map<String,Integer> freqMap=new HashMap<>();
        for(String b:a){
            Integer freq = freqMap.get(b);
            if (freq==null){
                freqMap.put(b,1);
            }else{
                freqMap.put(b,freq+1);
            }
        }
        System.out.println(freqMap);

    }
}
