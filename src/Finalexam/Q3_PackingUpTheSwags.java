package Finalexam;

/**
 DP思想来做这道切平方的题目：
 base case: Min[0]=0;
 induction rule: Min[i]=Math.min(Min[i],M[j]+1);
 i 表示到目前为止的第i个行李，Min[i]表示到第i个行李需要的最少包裹数量；
 j表示liner scane回头看的左大段，表示从左0起第j个行李处，剩下的右大段（i-j）个行李之间能否自成一个平方数量多包裹，
 如果是，那么就M[j]+1,表示从第j件开始右边（i-j）个就是再需要一个包裹M[j]+1;
 */

public class Q3_PackingUpTheSwags {
    public static void main(String[] args){
        int input=10;
        int packages=DP(input);
        System.out.println(input+"件行李，需要"+packages+"个包裹就够了");
    }
    public static int DP(int input){
        int[]Min=new int[input+1];
        for(int i=1;i<=input;i++){
            //intinal state
            Min[i]=i;
            for(int j=0;j<i;j++){
                if(isSquare(i-j)){
                    Min[i]=Math.min(Min[i],Min[j]+1);
                }
            }
        }
        return Min[input];
    }
    public static boolean isSquare(int i){
        int root=(int)Math.sqrt(i);
        if(root*root==i){
            return true;
        }else {
            return false;
        }
    }
}
//TC:O(n^2)
//SC:O(n)