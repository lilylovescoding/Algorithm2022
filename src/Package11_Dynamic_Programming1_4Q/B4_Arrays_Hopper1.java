package Package11_Dynamic_Programming1_4Q;

public class B4_Arrays_Hopper1 {
    public static void main(String[] args){
        int[] array={3,2,2,1,0,5};
        boolean Flag=canJump(array);
        System.out.println(Flag);
    }
    public static boolean canJump(int[]array){
        if(array.length==1){
            return true;
        }
        boolean[] canJ=new boolean[array.length];
        for(int i=array.length-2;i>=0;i--){
            if(i+array[i]>=array.length-1){
                canJ[i]=true;
            }else{
                for(int j=array[i];j>=1;j--){
                    if(canJ[i+j]){
                        canJ[i]=true;
                        break;
                    }
                }
            }
        }
        return canJ[0];
    }
}
//TC:O(n^2);
//SC:O(n)
