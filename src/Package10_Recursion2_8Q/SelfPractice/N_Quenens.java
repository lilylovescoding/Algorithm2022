package Package10_Recursion2_8Q.SelfPractice;

import java.util.*;

public class N_Quenens {
    public static void main(String[] args){
        int n =4;
        List<List<Integer>>result=new ArrayList<List<Integer>>();
        List<Integer> cur=new ArrayList<>();
        helper(n,cur,result);
        System.out.println(result);
    }
    public static void helper(int n,List<Integer> cur,List<List<Integer>>result){
        if(cur.size()==n){
            result.add(new ArrayList<Integer>(cur));
            return;
        }
        for(int column=0;column<n;column++){
            if(valid(cur,column)){
                cur.add(column);
                helper(n,cur,result);
                cur.remove(cur.size()-1);
            }
        }
    }
    public static boolean valid(List<Integer>cur,int column){
        int row=cur.size();
        for(int i=0;i<cur.size();i++){
            if(cur.get(i)==column||Math.abs(cur.get(i)-column)==row-i){
                return false;
            }
        }
        return true;
    }

}
