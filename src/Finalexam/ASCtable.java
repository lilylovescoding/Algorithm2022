package Finalexam;

import java.util.ArrayList;
import java.util.*;

//String 类型的integer转int类型: string"1"-->int 1
public class ASCtable {
    public static void main(String[] args){
        String a= "01121";
        int number1=a.charAt(0);
        int number2=a.charAt(0)-'0';
        System.out.println(number1);
        System.out.println(number2);

        String b = "ABCD";
        int result=b.charAt(0);
        int result2=b.charAt(0)-'0';
        System.out.println(result);
        System.out.println(result2);

        int number=1;
        char cur1=(char)(number-1+'A');
        System.out.println(cur1); //1->A  -->A+1-1
        char cur2='A'+1;
        System.out.println(cur2); //2->B  -->A+2-1
        char cur3='A'+2;
        System.out.println(cur3); //3->c  -->A+3-1

        StringBuilder res=new StringBuilder();
        res.append(cur1);
        res.append(cur2);
        res.append(cur3);
        System.out.println(res);
        String bb="abc";
        res.deleteCharAt(1);
        System.out.println(res);

        List<String> collection=new ArrayList<>();
        collection.add(res.toString());
        collection.add(bb);
        System.out.println(collection);

    }
}
