package Practice;

import java.util.Arrays;

public class leletimu {
    public static void main(String[] args){
        int[]a={1,2,3,0,0,0};
        int[]b={2,5,6};
        int m =3;
        int n =3;
        //out put:[1,2,2,3,5,6]
        int[]result=merge(a,b,m,n);
        //System.out.println(Arrays.toString(result));

        solution2(a,b,m,n);
        System.out.println(Arrays.toString(a));
    }
    private static int[] merge(int[]a,int[]b,int m,int n){
        int[]result=new int[m+n];
        int r=0;
        int i=0;
        int j=0;
        while(i<m&&j<n){
            if( a[i]<=b[j]){
                result[r]=a[i];
                i++;
                r++;
            }else{
                result[r]=b[j];
                j++;
                r++;
            }
        }
        while (i<m){
            result[r]=a[i];
            r++;
            i++;
        }
        while (j<n) {
            result[r] = b[j];
            r++;
            j++;

        }
        return result;
    }
    private static void solution2(int[]a,int[]b,int m,int n){
        int j =0;

        while(j<m){
            a[m]=b[j];
            j++;
        }
        System.out.println(Arrays.toString(a));
        if(a[m-1]<a[m]){
            m++;
        }else{
            while(m<0){
                swap(a[m-1],a[m]);
                m++;
            }
        }
    }
    public static void swap(int a ,int b){
        int tmp=a;
        a=b;
        b=tmp;

    }
}
