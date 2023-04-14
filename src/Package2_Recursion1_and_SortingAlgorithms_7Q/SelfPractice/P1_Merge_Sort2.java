package Package2_Recursion1_and_SortingAlgorithms_7Q.SelfPractice;

import java.util.Arrays;

public class P1_Merge_Sort2 {
    public static void main(String[] args){
        int[]array={8,2,9,4,5,6,7,4};
        int[]temp=new int[array.length];
        System.out.println(Arrays.toString(array));
        mergeSort(array,temp,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int[]array,int[]temp,int left,int right){
        if(left>=right){
            return;
        }
        int mid=(left+right)/2;
        mergeSort(array,temp,left,mid);
        mergeSort(array,temp,mid+1,right);
        merge(array,temp,left,mid,right);
    }
    public static void merge(int[]array,int[]temp,int left,int mid,int right){
        int i=left;
        int j=mid+1;
        int t=0;
        while(i<=mid && j<=right){
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
        while (j<=right){
            temp[t]=array[j];
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
