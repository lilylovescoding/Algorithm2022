package Practice_12_Practice_Problem_HashMap_API;

import java.util.ArrayList;
import java.util.*;

import static java.util.Arrays.sort;

public class array_arraylist_list {
    public static void main(String[] args){
        //array
        int[]a={4,2,3};
        sort(a);
        System.out.println(Arrays.toString(a));

        String[]b=new String[3];
        b[0]="a";  //添加
        b[1]="1";
        b[2]="c";
        System.out.println(Arrays.toString(b));
        b[1]="b";  //修改
        System.out.println(Arrays.toString(b));

        //arraylist
        ArrayList List=new ArrayList();

        List.add("e");   //增
        List.add(5);
        List.add("g");
        System.out.println(List);
        List.set(0, "a"); //改
        System.out.println(List);
        List.remove(0);//删
        System.out.println(List);
        System.out.println(List.get(0)); //查

        //list
        List<Integer> list=new ArrayList<>();

    }
}
