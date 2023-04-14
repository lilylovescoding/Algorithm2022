package Practice;

import java.util.ArrayList;
import java.util.List;

public class All_vaildparenthsis1 {
    public static void main(String[] args){
        int n = 2 ;
        List<String> result = new ArrayList<>();
        char [] cur = new char[n*2];
        helper(n,n,0,cur,result);
        System.out.println(result);


    }
    public static void helper(int left ,int right, int index ,char[] cur,List<String> result){
        //base case
        if( left== 0 && right== 0){
            result.add(new String(cur));
            printParenthsis(cur);
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
    public static void printParenthsis(char[]cur){
        int space=0;
        for(int i=0;i<cur.length;i++){
            if(cur[i]=='('){
                print(space);
                System.out.println(cur[i]);
                space+=2;
            }else{
                space-=2;
                print(space);
                System.out.println(cur[i]);
            }
        }
        System.out.println();
    }
    public static void print(int space){
        for(int i=0;i<space;i++){
            System.out.print("_");
        }
    }
}
//TC:O(2^2n*n)  2分支的height次方*打印
//SC:O(2n)  O(height)
