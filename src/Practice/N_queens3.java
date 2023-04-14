package Practice;


import java.util.*;

public class N_queens3 {
    public static void main(String[] args){
        int q=4;
        List<Integer> cur=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<List<Integer>>();
        helper(q,cur,result);
        System.out.println(result);
    }
    public static void helper(int q,List<Integer> cur,List<List<Integer>>result){
        if(cur.size()==q){
            result.add(new ArrayList<>(cur));
            return;
        }
        for(int newq=0;newq<q;newq++){
            if(join(cur,newq)){
                cur.add(newq);
                helper(q,cur,result);
                cur.remove(cur.size()-1);
            }
        }
    }
    public static boolean join(List<Integer>cur,int newq){
        for(int oldq=0;oldq<cur.size();oldq++){
            if(cur.get(oldq)==newq||Math.abs(cur.get(oldq)-newq)==cur.size()-oldq){
                return false;
            }
        }
        return true;
    }
}
