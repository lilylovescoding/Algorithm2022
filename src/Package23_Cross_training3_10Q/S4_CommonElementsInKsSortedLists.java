package Package23_Cross_training3_10Q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class S4_CommonElementsInKsSortedLists {
    public static void main(String[] args){
        Integer[] input1=new Integer[]{1,2,2,3};
        Integer[] input2=new Integer[]{2,2,3,5};
        Integer[] input3=new Integer[]{2,2,4};

        List<Integer> array1 = new ArrayList<Integer>(Arrays.asList(input1));    //将array转换为list对象
        List<Integer> array2 = new ArrayList<Integer>(Arrays.asList(input2));
        List<Integer> array3 = new ArrayList<Integer>(Arrays.asList(input3));

        List<List<Integer>> input = new ArrayList<>();
        input.add(new ArrayList<>(array1));
        input.add(new ArrayList<>(array2));
        input.add(new ArrayList<>(array3));

        System.out.println(input);              //打印一个多个列表多集合

        List<Integer> result = input.get(0);    //得到列表一
        System.out.println(result);
        Integer result2=result.get(0);
        System.out.println(result2);


        List<Integer> ComE = commonE(input);       //找到这些列表中的公共元素
        System.out.println(ComE);
    }
    private static List<Integer> commonE(List<List<Integer>> input){
        List<Integer> result = input.get(0);            //得到第一个列表；
        for(int i = 0 ; i<input.size();i++){            //遍历剩下的列表；
            result = helper(result , input.get(i));     //比较：列表1，列表二；把新生成的相同元素result列表 继续与与剩下的列表比较；
        }
        return result ;                                 //得到最终相同元素的列表集合；
    }
    private static List<Integer> helper(List<Integer> result,List<Integer> input){
        List<Integer>cur = new ArrayList<>();                       //创建一个临时相同元素的结果集，（最终返回它）
        int i = 0 ;
        int j = 0 ;
        while(i<result.size()&&j<input.size()){
            int compare = result.get(i).compareTo(input.get(j));
            if(compare==0){
                cur.add(result.get(i));
                i++;
                j++;
            }else if(compare<0){
                i++;
            }else{
                j++;
            }
        }
        return cur;
    }
}
//TC:O(kn)
//SC:O(n)
