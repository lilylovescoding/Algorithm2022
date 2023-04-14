package Package16_Cross_training1_15Q;

import java.util.Arrays;

//{1, 2, 2, 3, 3, 3} → {1}
public class B3_ArrayDeduolication_3 {
    public static void main(String[] args) {
        int[] array = {0,1, 1, 2, 2, 3, 3, 3 };
        int[] dedu=deduplicate(array);
        System.out.println(Arrays.toString(dedu));
    }
    private static int[] deduplicate(int [] array){
        int s = 0 ;
        int f = 0 ;
        while(f<array.length){
            int ff = f + 1 ;
            while(ff<array.length && array[ff]==array[f]){
                ff++;
            }
            if(ff-f==1){
                array[s]=array[f];
                s++;
            }
            f=ff;
        }
        return Arrays.copyOf(array,s);
    }
}
