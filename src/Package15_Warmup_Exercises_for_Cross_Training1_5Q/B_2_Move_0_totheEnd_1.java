package Package15_Warmup_Exercises_for_Cross_Training1_5Q;

import java.util.Arrays;

public class B_2_Move_0_totheEnd_1 {
    public static void main(String[] args){
        int[]array={1,0,3,0,1};
        move(array);
        System.out.println(Arrays.toString(array));
    }
    private static void move(int[] array){
        int left = 0 ;
        int right = array.length-1 ;
        while(left<=right){
            if(array[left]!=0){
                left++;
            }else if(array[right]==0){
                right--;
            }else {
                swap(array,left,right);
                left++;
                right--;

            }
        }
    }
    private static void swap(int[]array,int left,int right){
        int temp = array[left];
        array[left]=array[right];
        array[right]=temp;
    }
}
