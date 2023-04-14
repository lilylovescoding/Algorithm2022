package Package9_String2_11Q;

public class B1_Reverse_String {
    public static void main(String[] args){
        String a="google";
        System.out.println("Original String： "+ a);

        char[]b=a.toCharArray();
        System.out.println("String转化为char数组，可以用index索引到任何一个字母："+ b[1]);

        String c=new String(b);
        System.out.println("char转为string并打印： "+ c);

        String resrult=reverse(a);
        System.out.println("Reverse String： "+resrult);

        int t=1/2;
        System.out.println(t);
    }
    public static String reverse(String a){
        if(a==null||a.length()<=1){
            return a;
        }
        char[]array=a.toCharArray();
        for(int left=0,right=array.length-1;left<right;left++,right--){
            swap(array,left,right);
        }
        return new String(array);
    }
    private static void swap(char[] array, int left, int right){
        char temp=array[left];
        array[left]=array[right];
        array[right]=temp;
    }
}
