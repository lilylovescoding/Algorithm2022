package Package12_Dynamic_Programming2_5Q;


import java.util.*;

public class B3_Dictionary_Word_1 {
    public static void main(String[] args){
        Set<String> dictionary=new HashSet<>();
        dictionary.add("ab");
        dictionary.add("bo");

        String input="abbo";

        boolean t= dictionary.contains(input.substring(0,2));
        System.out.println(t);

        System.out.println(check(input,dictionary));

    }
    public static boolean check(String input,Set<String> dictionary){
        boolean[]M=new boolean[input.length()+1];
        M[0]=true;
        for(int i=1;i<=input.length();i++){
            for(int j=0;j<i;j++){
                if (M [j] && dictionary.contains(input.substring(j,i))){
                    M[i]=true;
                    break;
                }
            }
        }
        return M[input.length()];
    }
}
