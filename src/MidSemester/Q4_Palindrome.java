package MidSemester;

public class Q4_Palindrome {
    public static void main(String[] args){
        String a="abaa";
        int result=mincut(a);
        System.out.println(result);
    }
    public static int mincut(String a){
        char[]array=a.toCharArray();
        int[]M=new int[array.length+1];
        M[0]=0;
        M[1]=0;
        for (int i=2;i < M.length;i++){
            int mincut=i;
            for(int j=0;j<i;j++){
                if(isPalindrome(array,j,i-1)){
                    if(j==0){
                        mincut=0;
                        break;
                    }else{
                        mincut=Math.min(mincut,M[j]+1);
                    }
                }
            }
            M[i]=mincut;
        }
        return M[array.length];
    }
    private static boolean isPalindrome(char[] array, int i, int j){
        while(i<j){
            if(array[i]!=array[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

