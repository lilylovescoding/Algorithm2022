package Package7_GraphSearch2_DFS_4Q.SelfPractice;

import java.util.*;

public class Q_1_2_two_sum {   //找出array（1234）中，所有的和为 1234 总和 一半的subset 。
    public static void main(String[] args){
        String a = "1234";

        List<String> result = new ArrayList<String>();
        char[]set = a.toCharArray();

//        int totalsum = sum(set);
//        System.out.println(a+"的总和为"+ totalsum);

        StringBuilder cur=new StringBuilder();
        helper(set,cur,0,result);
        System.out.println(result);

    }
    private static void helper(char[]set , StringBuilder cur , int index , List<String>rsult){
        //base case
        if(index==set.length){
            //rsult.add(cur.toString());
            check(cur,set,rsult);
            return;
        }
        helper(set,cur.append(set[index]) , index+1 ,rsult);    //吃
        cur.deleteCharAt(cur.length()-1);                             //吐
        helper(set,cur,index+1,rsult);                          //不吃

    }
    private static int sum(char[]set){
        int total = 0 ;
        for(int i = 0 ; i<=set.length-1 ; i++ ){
            total += Character.getNumericValue(set[i]);
        }
        return total;
    }
    private static void check(StringBuilder cur , char[]set ,List<String>rsult){
        String a = cur.toString();
        char[] b= a.toCharArray();
        if(sum(b)==sum(set)/2){
            rsult.add(cur.toString());
        }
    }
}
//}else if(sum(cur.toString().toCharArray())==sum(set)){
//        rsult.add(cur.toString());
//        }else{