package Package12_Dynamic_Programming2_5Q;

import java.util.Arrays;

public class S2_Largest_Square_Of_1s {     //google面试题，  求出最大的全1正方形
    public static void main(String[] args){
        int[][]matrix=new int[][]{{0,0,0,0},
                                  {1,1,1,1},
                                  {0,1,1,1},
                                  {1,1,1,1}};
        System.out.println("Original matrix: "+Arrays.deepToString(matrix));
        System.out.println("matrix length: "+matrix.length);
        int N=matrix.length;
        int[][]large=new int[N][N];
        System.out.println("new large: "+Arrays.deepToString(large));
        int plus=matrix[1][1]+1;
        System.out.println("matrix[1][1]+1="+plus);

        int s=LargestSquareOf1s(matrix);
        System.out.println("largest square of 1s is ："+s);

    }
    public static int LargestSquareOf1s(int[][] matrix){
        int N=matrix.length;
        //cornercase
        if(N==0){
            return 0;
        }
        int result=0;
        int[][]max=new int[N][N];

        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                //base case
                if(i==0||j==0){
                    max[i][j]=matrix[i][j]==1?1:0;
                }else if(matrix[i][j]==1){
                    max[i][j]=Math.min(max[i-1][j],max[i][j-1]);
                    max[i][j]=Math.min(max[i-1][j-1],max[i][j]);
                    max[i][j]=max[i][j]+1;
                }
                result=Math.max(result,max[i][j]);
            }
        }
        return result;
    }
}
//TC:O(N^2);
//SC:O(N^2)
