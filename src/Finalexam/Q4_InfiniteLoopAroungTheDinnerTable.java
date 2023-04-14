package Finalexam;

/**
 * input: an array of names;
 * out put:True or false;
 * 以下输入是错误的，不是说是错误的，主要是String[]创建的时候复制粘贴中文标点符号导致创建错误，纠结好久，
 * ArrayList<String> input2=new ArrayList<String>();
 * input2.add("ALICE");
 * input2.add("CHARLES");
 */

import java.util.ArrayList;


public class Q4_InfiniteLoopAroungTheDinnerTable {
    public static void main(String[]args){
        String a="abc";
        String[] input={"ALICE","CHARLES","ERIC","SOPHIA"};
        String[] result=new String[input.length];
        boolean result1=canChain(input);
        System.out.println(result1);
    }
    public static boolean canChain(String[] input){
        return helper(input,1);
    }
    public static boolean helper(String[] input,int index){
        //base case
        if(index==input.length){
            return canSit(input[index-1],input[0]); //检查最后以为和第一个能否接上
        }
        for(int j=index;j<input.length;j++){
            if(canSit(input[index-1],input[j])){
                swap(input,index,j);
                if(helper(input,index+1)){   //if false的话后面的说明在当前组合下是走不通的，进行下一步swap回来
                    return true;
                }
                swap(input,index,j);                //需要swap回来，继续for循环中的另一条分支走；
            }
        }
        return false;
    }
    public static boolean canSit(String first,String second){
        return first.charAt(first.length()-1)==second.charAt(0);
    }
    public static void swap(String[]input,int i,int j ){
        String temp=input[i];
        input[i]=input[j];
        input[j]=temp;
    }
}
//TC:O(n!)
//SC:O(n)
