package Package11_Dynamic_Programming1_4Q.SelfPractice;

public class Max_Procduct_of_Cutting_Rope2 {
    public static void main(String[] args){
        int rope=5;
        int result=cut(rope);
        System.out.println(result);
    }
    public static int cut(int rope){
        int[]max=new int[rope+1];
        max[0]=0;
        max[1]=0;
        for (int i=2;i<=rope;i++){
            for(int j=1;j<i;j++){
                max[i]=Math.max(max[i],Math.max(j,max[j])*(i-j));
            }
        }
        return max[rope];
    }

}
