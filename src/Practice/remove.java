package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class remove {
    public static void main(String[] args){
        List<Integer> e=new ArrayList<>();
        e.add(11);
        e.add(22);
        e.add(33);
        System.out.println(e);
        e.remove(1);
        System.out.println(e);
        System.out.println(e.get(0));
        int[]global=new int[]{Integer.MIN_VALUE};
        System.out.println(Arrays.toString(global));
    }
}
