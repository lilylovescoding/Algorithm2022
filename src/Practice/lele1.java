package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lele1 {
    public static void main(String[]args){
        int[]a = {1,2,3};
        System.out.println(Arrays.toString(a));

        List<Integer>b=new ArrayList<Integer>();
        b.add(1);
        b.add(2);
        System.out.println(b);

        int[]aa=new int[5];
        System.out.println(Arrays.toString(aa));
        aa[1]=1;
        System.out.println(Arrays.toString(aa));
    }
}
