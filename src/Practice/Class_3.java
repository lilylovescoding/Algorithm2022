package Practice;
import java.util.Arrays;

public class Class_3 {
    public static void main(String[] args){

//        //创建一个有10个元素第数列arr：
//        int[]arr= new int[10];
//
//        //打印数列arr长度：10
//        System.out.println(arr.length);
//
//        //打印数列arr：[0，0，0，0，0，0，0，0，0，0]
//        System.out.println(Arrays.toString(arr));
//
//        //打印数列arr第3个元素：0
//        System.out.println(arr[3]);
//
//        //创建一个为[1，2，3，4，5]数列array：
//        int[]array={1,2,3,4,5};
//
//        //打印数列array：[1，2，3，4，5]
//        System.out.println(Arrays.toString(array));
//
//        //打印数列array第3个元素：4
//        System.out.println(array[3]);
//
////        for(int i=0;i<10;i++){
////            arr[i]=i*10;
////        }
////        System.out.println(arr[5]);
//
//        int[][]arr_2=new int[4][6];
//        int[][]arr_3=new int[][]{{1,2,3},{4,5,6}};
//        System.out.println(Arrays.deepToString(arr_2));
//        System.out.println(Arrays.deepToString(arr_3));
//        int s=arr_3[0][2];
//        System.out.println(s);

        int m=4,n=6;
        int[][]matrix=new int[m][n];
        //System.out.println(Arrays.deepToString(matrix));
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=i;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
        //System.out.println(matrix[2][3]);

    }
}
