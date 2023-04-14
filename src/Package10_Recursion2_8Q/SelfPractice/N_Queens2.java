package Package10_Recursion2_8Q.SelfPractice;

import java.util.*;

public class N_Queens2 {
    public static void main(String[] args){
        int k=4;
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        List<Integer> cur=new ArrayList<Integer>();
        join(k,cur,result);
        System.out.println(result);
    }
    public static void join(int n,List<Integer> cur,List<List<Integer>> result){
        if(cur.size()==n){
            result.add(new ArrayList<Integer>(cur));
            return;
        }
        for(int curcolumn=0;curcolumn<n;curcolumn++){
            if(valid(cur,curcolumn)){
                cur.add(curcolumn);
                join(n,cur,result);
                cur.remove(cur.size()-1);
            }
        }
    }
    public static boolean valid(List<Integer> cur,int curcolumn){  //检查遍历放置的当前列 是否 与已放置棋子的位置有冲突
        for(int curqueen=0;curqueen<cur.size();curqueen++){
            if((cur.get(curqueen)==curcolumn)||Math.abs(curcolumn-cur.get(curqueen))==cur.size()-curqueen){
                return false;                          //新皇后列数 -当前皇后列数  == 新皇后行数- 当前皇后行数
            }
        }return true;

    }
}
