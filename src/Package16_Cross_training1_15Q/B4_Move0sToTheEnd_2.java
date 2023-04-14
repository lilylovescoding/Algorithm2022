package Package16_Cross_training1_15Q;

import java.util.Arrays;

public class B4_Move0sToTheEnd_2 {
    public static void main(String[] args){
        int[]array={1,0,3,0,1};
        move(array);
        System.out.println(Arrays.toString(array));
    }
    private static void move(int[] array){
        int s = 0 ;
        for(int f = 0 ; f < array.length ; f ++){
            if (array[f]==0){
                continue;
            }else{
                swap(array,s,f);
                s ++ ;
            }
        }
        return;
    }
    private static void swap(int[]array , int s ,int f){
        int temp = array[s];
        array[s]=array[f];
        array[f]=temp;
    }
}
