package Package11_Dynamic_Programming1_4Q.SelfPractice;

import java.util.ArrayList;
import java.util.List;

public class subarray {
    public static void main(String[] args){
        List<Integer>b=new ArrayList();
        int[]a={1,4,6,2};
        for(int i=0;i<=a.length-1;i++){
            for(int j=i;j<=a.length-1;j++){
                b.add(a[j]);
            }
        }
        System.out.println(b);
    }
}
