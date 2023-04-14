package Package11_Dynamic_Programming1_4Q;

public class B2_Longest_Ascending_Subarry {
    public static void main(String[] args){
        int[]a={2,4,5,3,5,7,8,5,};
        int result=helper(a);
        System.out.println(result);
    }
    public static int helper(int[] a){
        //corner case
        if (a.length==0){
            return 0;
        }
        int globalMax=1;
        int cur=1;
        for(int i=1;i<a.length;i++){
            if(a[i]>a[i-1]) {
                cur++;
                globalMax=Math.max(globalMax,cur);
            }else{
                cur=1;
            }
        }
        return globalMax;
    }

}
