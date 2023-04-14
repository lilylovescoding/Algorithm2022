package Package21_DFS2_12Q.KeTang.Q_1_AllSubSet;

import java.util.ArrayList;
import java.util.List;

public class Q_4_AllSubSetWithDuplicateElements {
    public static void main(String[] args){
        String a = "abb";


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
            rsult.add(cur.toString());

            return;
        }
        helper(set,cur.append(set[index]) , index+1 ,rsult);    //吃
        cur.deleteCharAt(cur.length()-1);                             //吐

        while (index<set.length-1 && set[index]==set[index+1]){
            index++;
        }

        helper(set,cur,index+1,rsult);                          //不吃

    }

}
