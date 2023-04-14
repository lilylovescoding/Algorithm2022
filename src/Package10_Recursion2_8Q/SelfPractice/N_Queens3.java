package Package10_Recursion2_8Q.SelfPractice;

import java.util.*;

public class N_Queens3 {
    public static void main(String[] args){
        int queen=4;
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> cur=new ArrayList<Integer>();
        helper(queen,cur,result);
        System.out.println(result);
    }
    public static void helper(int queen,List<Integer> cur,List<List<Integer>> result){
        if(cur.size()==queen){
            result.add(new ArrayList<Integer>(cur));
            return;
        }
        for(int i=0;i<queen;i++){  //放进去新的皇后，判断其是否合法
            if(valid(cur,i)){
                cur.add(i);
                helper(queen,cur,result);
                cur.remove(cur.size()-1);
            }
        }
    }
    public static boolean valid(List<Integer> cur,int i){
        for(int j=0;j<cur.size();j++){
            if(cur.get(j)==i || Math.abs(i-cur.get(j))==cur.size()-j){
                return false;
            }
        }
        return true;
    }
}
