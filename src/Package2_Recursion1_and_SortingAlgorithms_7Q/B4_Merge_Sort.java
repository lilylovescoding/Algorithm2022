package Package2_Recursion1_and_SortingAlgorithms_7Q;

import java.util.Arrays;

public class B4_Merge_Sort {
    public static void main(String[] args){
        int []array={8,4,5,7,1,3,6,2};
        int []temp=new int[array.length];
        mergeSort(array,0, array.length -1,temp);
        System.out.println(Arrays.toString(array));
    }
    //
    public static void mergeSort(int[]array,int left,int right,int[]temp){
        if(left>=right){
            return;
        }
        int mid=(right+left)/2;
        mergeSort(array,left,mid,temp);
        mergeSort(array,mid+1,right,temp);
        merge(array,left,mid,right,temp);
    }

    //merge method
    public static void merge(int[]array,int left,int mid,int right,int[]temp){
        int i=left;
        int j=mid+1;
        int t=0;
        while (i<=mid && j<=right){
            if(array[i]<=array[j]){
                temp[t]=array[i];
                t++;
                i++;
            }else{
                temp[t]=array[j];
                t++;
                j++;
            }
        }
        while (i<=mid){
            temp[t]=array[i];
            t++;
            i++;
        }
        while (j<=right) {
            temp[t] = array[j];
            t++;
            j++;
        }
        t=0;
        int tempLeft=left;
        while (tempLeft<=right){
            array[tempLeft]=temp[t];
            t++;
            tempLeft++;
        }

    }
}
