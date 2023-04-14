package Package1_BinarySearch_8Q;

public class B1_Classical_BinarySearch {
    public static void main(String[]args){
        int[]array={2,3};
        int T = 3 ;
        int resultIndex=binarySearch(array,T);
        System.out.println(resultIndex);
    }
    private static int binarySearch(int[]array,int T ){
        int left=0;
        int right=array.length-1;
        while(left<=right){
            int middle=left+(right-left)/2;
            if(array[middle]==T){
                return middle;
            }else if(array[middle]<T){
                left=middle+1;
            }else{
                right=middle-1;
            }
        }
        return -1;
    }
}
