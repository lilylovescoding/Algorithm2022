package Package21_DFS2_12Q.KeTang.Q_1_AllSubSet;

import java.util.ArrayList;
import java.util.List;

public class Q_5_AllSubSetWithDuplicateElementsWithKSize {     //找出有重复元素array中的所有指定长度的subset组合
    public static void main(String[] args){
        String a = "abb";
        int K = 3 ;

        List<String> result = new ArrayList<String>();
        char[]set = a.toCharArray();

//        int totalsum = sum(set);
//        System.out.println(a+"的总和为"+ totalsum);

        StringBuilder cur=new StringBuilder();
        helper(set,cur,0,result,K);
        System.out.println(result);

    }
    private static void helper(char[]set , StringBuilder cur , int index , List<String>rsult,int K){
        //base case
        if(index==set.length){
            //rsult.add(cur.toString());
            checkLength(cur,K,rsult);
            return;
        }
        helper(set,cur.append(set[index]) , index+1 ,rsult,K);    //吃
        cur.deleteCharAt(cur.length()-1);                             //吐

        while (index<set.length-1 && set[index]==set[index+1]){
            index++;
        }

        helper(set,cur,index+1,rsult,K);                          //不吃

    }
    private static void checkLength(StringBuilder cur ,int k ,List<String>rsult){
        String a = cur.toString();
        if(a.length()==k){
            rsult.add(cur.toString());
        }
    }
}
