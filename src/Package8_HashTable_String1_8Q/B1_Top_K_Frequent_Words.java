package Package8_HashTable_String1_8Q;
import java.util.*;

public class B1_Top_K_Frequent_Words {
    public static void main(String[]args){
        String[] composition = {"a","a","a","b","b","c","c","c","c"};
        int k = 2;

        //Find the Top K frequent Words in giving string
        String[] result = topKFrenquent(composition,k);
        System.out.println(Arrays.toString(result));
    }
    public static String[] topKFrenquent(String[]composition , int k){

        Map<String,Integer> freqMap= getFreqMap(composition); //将给定的字符串，每个字母出现的数字变换成 map

        //初始化 minheap 数据结构，一下将要一个一个传进去比较排序得到最优解，，
        PriorityQueue<Map.Entry<String,Integer>> minheap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for(Map.Entry<String,Integer> entry : freqMap.entrySet()){
            if(minheap.size()<k){
                minheap.offer(entry);
            }else if(entry.getValue()>minheap.peek().getValue()){
                minheap.poll();
                minheap.offer(entry);
            }
        }
        return freqArray(minheap);      //搜集到了最终的前k个的minheap数据；
    }


    public static Map<String,Integer> getFreqMap(String[]composition){
        Map<String,Integer> freqMap=new HashMap<>();    //初始化 map，用来储存 composition
        for(String s : composition){                    //用string键a   逐一遍历每个字母；
            Integer freq = freqMap.get(s);              //新建integer freq ，freqMap里还没有s，也没有值，所以，freq初始值null；
            if(freq==null){
                freqMap.put(s,1);
            }else{                                      //如果freqMap里监测到当前s字母的freq值不是null，就把freq加1
                freqMap.put(s,freq+1);
            }
        }
        return freqMap;         //把给定的string处理好后的Map返回；
    }

    public static String[] freqArray(PriorityQueue<Map.Entry<String,Integer>> minheap){
        String[] result=new String[minheap.size()];     //初始化string容量，用来添加新元素；
        for (int i = minheap.size()-1; i >= 0 ; i--){   //从后往前打印，就出现了从频率高往频率低打印的顺序
            result[i]=minheap.poll().getKey();
        }
        return result;
    }


}
