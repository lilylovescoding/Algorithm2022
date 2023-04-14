package Practice;

import java.util.ArrayList;
import java.util.List;

public class N_Queens2 {
    public static void main(String[] args){
        int q=4;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        helper(q,cur,result);
        System.out.println(result);
    }
    public static void helper(int q,List<Integer> cur,List<List<Integer>> result){
        if(cur.size() == q){
            result.add(new ArrayList<>(cur));
        }
        for(int newq = 0; newq < q; newq++){
            if(ok(cur,newq)){
                cur.add(newq);
                helper(q,cur,result);
                cur.remove(cur.size()-1);
            }
        }
    }
    public static boolean ok(List<Integer> cur,int newq){
        for(int oldq = 0; oldq < cur.size() ; oldq++){
            if( newq==cur.get(oldq) || Math.abs(newq-cur.get(oldq)) == cur.size()-oldq){
                return false;
            }
        }
        return true;
    }
}
//TC:O(n^n*n)
//SC:O(n)
