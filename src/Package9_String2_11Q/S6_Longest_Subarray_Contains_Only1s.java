package Package9_String2_11Q;

public class S6_Longest_Subarray_Contains_Only1s {
    public static void main(String[] args){
        int[]a={1,0,0,1,};
        int k=2;
        int l =longestContain(a,k);
        System.out.println(l);
    }
    public static int longestContain(int[]a,int k){
        int slow=0;
        int fast=0;
        int count=0;
        int longest=0;
        while(fast<a.length){
            if (a[fast]==1){
                longest=Math.max(longest,++fast-slow);
            }else if(count<k){
                count++;
                longest=Math.max(longest,++fast-slow);
            }else if(a[slow++]==0){    //先判断 后++
                count--;
            }
        }
        return longest;
    }

}
