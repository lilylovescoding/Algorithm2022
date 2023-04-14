package Package9_String2_11Q;

import java.util.HashSet;
import java.util.Set;

public class S4_Longst_Substring_Without_Repeating_Characters {
    public static void main(String[] args){
        String a="abcda";
        System.out.println("Original String: "+a);

        int result=longSt(a);
        System.out.println(result);
    }
    public static int longSt(String a){
        Set<Character> distinct=new HashSet<>();
        int slow=0;
        int fast=0;
        int longest=0;
        while(fast<a.length()){
            if(distinct.contains(a.charAt(fast))){
                distinct.remove(a.charAt(slow++));
            }else{
                distinct.add(a.charAt(fast++));
                longest=Math.max(longest,fast-slow);
            }
        }

    return longest;
    }
}
