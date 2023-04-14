package Package16_Cross_training1_15Q;

import java.util.Arrays;

public class B1_ArrayDeduplication_1 {
    public static void main(String[] args){
        int[] array={0,1,1,2,2,2,3};
        int[] dearray=deduplicate(array);
        System.out.println(Arrays.toString(dearray));
    }
    private static int[] deduplicate(int[] array){
        int s = 1;
        for(int f =1 ; f < array.length ; f ++){
            if(array[f]==array[s-1]){
                continue;
            }else{
                array[s]=array[f];
                s++;
            }
        }
        return Arrays.copyOf(array,s);  //O（n）
    }
}
