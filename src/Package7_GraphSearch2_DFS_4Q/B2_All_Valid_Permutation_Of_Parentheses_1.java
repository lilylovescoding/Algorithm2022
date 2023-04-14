package Package7_GraphSearch2_DFS_4Q;

import java.util.*;

public class B2_All_Valid_Permutation_Of_Parentheses_1 {
    public static void main(String[] args){
        List<String>result=new ArrayList<String>();
        int k=2;
        char cur[] =new char[k*2];
        helper(cur,k,k,0,result);
        System.out.println(result);
    }
    public static void helper(char[]cur,int left,int right,int index,List<String> result){
        if(left==0 && right==0){
            result.add(new String(cur));
            return;
        }
        if(left>0){
            cur[index]='(';
            helper(cur,left-1,right,index+1,result);

        }
        if(right>left){
            cur[index]=')';
            helper(cur,left,right-1,index+1,result);
        }
    }
}
