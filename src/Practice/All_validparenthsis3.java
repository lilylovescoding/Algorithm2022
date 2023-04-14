package Practice;

import java.util.ArrayList;
import java.util.List;

public class All_validparenthsis3 {
    public static void main(String[] args){
        int n =4;
        List<String>result=new ArrayList<>();
        char[]cur=new char[n*2];
        helper(n,n,0,cur,result);
        System.out.println(result);
    }
    public static void helper(int left,int right,int index,char[]cur,List<String> result){
        //base case
        if(left==0&&right==0){
            result.add(new String(cur));
            return;
        }
        if(left>0){
            cur[index]='(';
            helper(left-1,right,index+1,cur,result);

        }
        if(right>left){
            cur[index]=')';
            helper(left,right-1,index+1,cur,result);
        }
    }
}
