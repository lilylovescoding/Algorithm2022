package Package10_Recursion2_8Q;

import java.util.*;

public class Spiral_Order_Traverse_1 {
    public static void main(String[] args){
        int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        int[][]b={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int size=a.length;
        System.out.println(Arrays.deepToString(a));
        System.out.println(size);
        System.out.println(a[1][1]);

        List<Integer> result=spiral2(a);
        System.out.println(result);

        List<Integer> result1=spiral(a);
        System.out.println(result1);

        List<Integer> result2=spiral2(b);
        System.out.println(result2);

        List<Integer> result3=spiral(b);
        System.out.println(result3);
    }
    public static List<Integer> spiral2(int[][]a){
        List<Integer> list=new ArrayList<Integer>();
        int n=a.length;
        int start=0;
        int end=n-1;
        while (start<end){
            for(int i=start;i<=end;i++){
                list.add(a[start][i]);
            }
            for(int i=start+1;i<=end-1;i++){
                list.add(a[i][end]);
            }
            for(int i=end;i>=start;i--){
                list.add(a[end][i]);
            }
            for(int i=end-1;i>=start+1;i--){
                list.add(a[i][start]);
            }
            start++;
            end--;
        }
        if(start==end){
            list.add(a[start][end]);
        }
        return list;
    }

    public static List<Integer> spiral(int[][] a){
        List<Integer> list=new ArrayList<Integer>();
        recursiveTraverse(a,0,a.length,list);
        return list;
    }
    public static void recursiveTraverse(int[][]a,int offset,int size,List<Integer> result){
        if(size==0){
            return;
        }
        if(size==1){
            result.add(a[offset][offset]);
            return;
        }
        for(int i=0;i<size-1;i++){
            result.add(a[offset][offset+i]);
        }
        for(int i=0;i<size-1;i++){
            result.add(a[offset+i][offset+size-1]);
        }
        for(int i=size-1;i>=1;i--){
            result.add(a[offset+size-1][offset+i]);
        }
        for (int i=size-1;i>=1;i--){
            result.add(a[offset+i][offset]);
        }
        recursiveTraverse(a,offset+1,size-2,result);
    }
}
