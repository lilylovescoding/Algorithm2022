package Package9_String2_11Q;

public class B3_Right_Shift_By_N_Characters {
    public static void main(String[] args){
        String g="google";
        String shift=Shift(g,2);
        System.out.println("Right_Shift:"+shift);
    }
    public static String Shift(String g, int x){
        if(g.length()<=1){
            return g;
        }
        char[]go=g.toCharArray();
        int k= x % go.length;
        swap(go,0,go.length-1);
        swap(go,0,k-1);
        swap(go,k,go.length-1);
        return new String(go);
    }
    public static void swap(char[]go,int left,int right){
        while (left<right){
            char temp=go[left];
            go[left]=go[right];
            go[right]=temp;
            left++;
            right--;

        }

    }
}
