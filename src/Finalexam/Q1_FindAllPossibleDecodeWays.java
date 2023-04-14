package Finalexam;
import java.util.*;

public class Q1_FindAllPossibleDecodeWays {
    public static void main(String[]args){
        String input = "1121";
        List<String> result = decode(input);
        System.out.println(result);
    }
    private static List<String> decode(String input){
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(result,sb,input,0);
        return result;
    }
    private static void helper(List<String> result,StringBuilder sb,String input,int index){
        //base case
        if (index==input.length()){
            result.add(sb.toString());
            return;
        }
        int number = input.charAt(index)-'0';
        //decode 1
        if(number>=1 && number<=9){
            char cur=(char)(number-1+'A');
            sb.append(cur);
            helper(result,sb,input,index+1);
            sb.deleteCharAt(sb.length()-1);
        }
        //decode 2
        if(index+1<input.length()){
            number=(input.charAt(index)-'0')*10+(input.charAt(index+1)-'0');
            if(number>=10 && number<=26){
                char cur=(char)(number-1+'A');
                sb.append(cur);
                helper(result,sb,input,index+2);
                sb.deleteCharAt(sb.length()-1);
            }
        }
    }
}
