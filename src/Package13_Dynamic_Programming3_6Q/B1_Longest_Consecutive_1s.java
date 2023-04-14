package Package13_Dynamic_Programming3_6Q;

public class B1_Longest_Consecutive_1s {
    public static void main(String[] args){
        int[]array={1,0,1,1,1,1,1,0,0,1,0};
        int result=longest(array);
        System.out.println(result);
    }
    private static int longest(int[] array){
        int result=0;
        int cur=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==1){
                if(i==0||array[i-1]==0){
                    cur=1;
                }else{
                    cur++;
                }
                result=Math.max(result,cur);
            }
        }
        return result;
    }
}
