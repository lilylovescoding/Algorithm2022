package Package12_Dynamic_Programming2_5Q;

public class B2_Largest_SubArray_Sum {
    public static void main(String[] args){
        int [] array={3,4,6,1,2,6,3,};
        int result=sumMax(array);
        System.out.println(result);
    }
    public static int sumMax(int [] array){
        int[]M=new int[array.length];
        M[0]=array[0];
        int globalMax=array[0];
        for(int i=1;i<array.length;i++){
            M[i]=Math.max(M[i-1]+array[i],array[i]);
            globalMax=Math.max(globalMax,M[i]);
        }
        return globalMax;
    }
}
