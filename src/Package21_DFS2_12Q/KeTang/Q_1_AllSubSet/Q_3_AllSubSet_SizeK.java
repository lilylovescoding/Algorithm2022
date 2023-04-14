package Package21_DFS2_12Q.KeTang.Q_1_AllSubSet;

import java.util.ArrayList;
import java.util.List;

public class Q_3_AllSubSet_SizeK {  //找出array有所有subset组合中，元素数量为k的subset组合
    public static void main(String[] args){
        String a = "1234";
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
        helper(set,cur,index+1,rsult,K);                          //不吃

    }
    private static void checkLength(StringBuilder cur ,int k ,List<String>rsult){
        String a = cur.toString();
        if(a.length()==k){
            rsult.add(cur.toString());
        }
    }
}
