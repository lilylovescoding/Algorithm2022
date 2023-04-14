package Package7_GraphSearch2_DFS_4Q;


import java.util.*;

public class B1_All_subsets {  //subsequence
    public static void main(String[] args){
        List<String>result=new ArrayList<>();
        char data[] = {'a', 'b', 'c'};
        String abc = new String(data);
        System.out.println(abc);
        StringBuilder sb=new StringBuilder();
        helper(data,sb,0,result);
        System.out.println(result);
    }
    public static void helper(char[]data, StringBuilder sb, int index, List<String> result){
        if(index==data.length){
            result.add(sb.toString());
            return;
        }
        helper(data,sb,index+1,result);                              //不吃
        helper(data,sb.append(data[index]),index+1,result);          //吃
        sb.deleteCharAt(sb.length()-1);                                    //吐
    }
}
