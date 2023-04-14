package Package10_Recursion2_8Q.SelfPractice;

import java.util.*;

public class N_Queen4 {
    public static void main(String[] args){
        int queen=4;
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        List<Integer>cur=new ArrayList<Integer>();
        helper(queen,cur,result);
        System.out.println(result);
    }
    public static void helper(int queen,List<Integer>cur,List<List<Integer>> result){
        if(cur.size()==queen){
            result.add(new ArrayList<Integer>(cur));
            return;
        }
        for(int column=0; column<queen;column++){
            if(valid(cur,column)){
                cur.add(column);
                helper(queen,cur,result);
                cur.remove(cur.size()-1);
            }
        }
    }
    public static boolean valid(List<Integer>cur,int column){
        for(int j=0;j<cur.size();j++){
            if(column==cur.get(j)||Math.abs(column-cur.get(j))==cur.size()-j){
                return false;
            }
        }
        return true;
    }
}
