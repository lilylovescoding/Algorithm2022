package Package9_String2_11Q;

public class B2_Reverse_Words_In_A_Sentence1 {
    public static void main(String[] args){
        String a ="I Love Lele";
        System.out.println("Original String "+a);
        String result=reverse(a);
        System.out.println("Reverse String："+result);
    }
    private static String reverse(String a){
        char[]array=a.toCharArray();
        swap(array,0,array.length-1);
        int start=0;
        for(int i=0;i<array.length-1;i++){
            if(array[i]!=' ' && (i==0||array[i-1]==' ')){
                start=i;
            }
            if(array[i]!=' '&&(i==array.length-1||array[i+1]==' ')){
                swap(array,start,i);
            }
        }
        return new String(array);
    }
    private static void swap(char[]array,int left,int right){
        while (left<right){
            char temp=array[left];
            array[left]=array[right];
            array[right]=temp;
            left++;
            right--;
        }
    }
}
