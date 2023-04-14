package Package21_DFS2_12Q.KeTang.Q_2_AllValidPermutationOfParenthsis;

import java.util.ArrayList;
import java.util.List;

public class Q_1_AllValidPermutationOfParentsis {
    public static void main(String[] args){
        int n = 2 ;      //两对括号
        int k=2*n;

        StringBuilder cur = new StringBuilder(n*2);
        List<String>result=new ArrayList<>();
        helper(n,0,0, 0 ,cur,result);
        System.out.println(result);
    }
    private static void helper(int n ,int l,int r ,int index,StringBuilder cur,List<String> result){
        //base case
        if(l==n && r==n){
            result.add(cur.toString());
            return;
        }
        if(l<n){
            helper(n,l+1,r,index+1,cur.append('('),result);     //吃
            cur.deleteCharAt(cur.length()-1);                            // 吐
        }
        if(l>r&&r<n){
            helper(n,l,r+1,index+1,cur.append(')'),result);    //吃
            cur.deleteCharAt(cur.length()-1);                           //吐
        }
    }
}
