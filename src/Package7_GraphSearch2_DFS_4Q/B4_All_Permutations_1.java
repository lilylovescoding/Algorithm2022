package Package7_GraphSearch2_DFS_4Q;

import java.util.ArrayList;
import java.util.List;

public class B4_All_Permutations_1 {     // 课程 01：22：00
    public static void main(String[] args){
        //实验：List是接口，Arraylist是实现类，继承List增删改查的各种方法
        List<String>result=new ArrayList<>();
        ArrayList<String>result2=new ArrayList<>();
        List<Integer>result3=new ArrayList<>();
        result.add("long");
        result.add("le");
        System.out.println(result);
        result2.add("feng");
        result2.add("chen");
        System.out.println(result2);
        result3.add(1);
        result3.add(2);
        System.out.println(result3);

        //Permutation方法
        String a="abc";
        System.out.println("Original Strign: "+a);
        List<String> result4=permutatoin(a);
        System.out.println("Permutation Strign: "+result4);
    }
    public static List<String> permutatoin(String a){
        List<String> result4=new ArrayList<String>();
        if(a==null){
            return result4;
        }
        char[]arr=a.toCharArray();
        helper(arr,0,result4);
        return result4;
    }
    public static void helper(char[]arr,int index,List<String> result4){
        //base case
        if(index==arr.length){
            result4.add(new String(arr));
        }
        for(int i=index;i<arr.length;i++) {
            swap(arr, index, i);
            helper(arr, index + 1, result4);  //每往下走，index都加1，i都取之范围从index——2
            swap(arr, index, i);
        }
    }
    public static void swap(char[] arr,int left,int right){
        char temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }


}
