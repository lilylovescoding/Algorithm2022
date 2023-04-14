package Practice;

import java.util.ArrayList;
import java.util.List;

public class N_queens4 {
    public static void main(String[] args){
        int N=4;
        List<List<Integer>>result=new ArrayList<List<Integer>>();
        List<Integer> cur=new ArrayList<Integer>();
        helper(N,cur,result);
        System.out.println(result);
    }
    public static void helper(int N,List<Integer> cur,List<List<Integer>> result){
        if(cur.size()==N){
            result.add(new ArrayList<>(cur));
            return;
        }
        for(int newq=0;newq <N; newq ++){
            if(valid(cur,newq)){
                cur.add(newq);
                helper(N,cur,result);
                cur.remove(cur.size()-1);
            }
        }
    }
    public static boolean valid(List<Integer> cur,int newq){
        for(int oldq=0;oldq<cur.size();oldq++){
            if(newq==cur.get(oldq)||Math.abs(cur.get(oldq)-newq)==cur.size()-oldq){
                return false;
            }
        }
        return true;

    }


}
