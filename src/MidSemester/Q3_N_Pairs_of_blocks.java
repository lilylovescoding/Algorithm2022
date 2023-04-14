package MidSemester;

public class Q3_N_Pairs_of_blocks {
    public static void main(String[] args){
        int n=2;
        char[]cur=new char[2*n];
        helper(n,n,0,cur);
    }
    public static void helper(int leftRemain,int righrRemian,int index,char[] cur){
        //base case
        if(leftRemain==0&&righrRemian==0){
            printBlock(cur);
            return;
        }
        if(leftRemain>0){
            cur[index]='{';
            helper(leftRemain-1,righrRemian,index+1,cur);
        }
        if(righrRemian>leftRemain){
            cur[index]='}';
            helper(leftRemain,righrRemian-1,index+1,cur);
        }
    }
    public static void printBlock(char[]cur){
        int space=0;
        for(int i=0;i<cur.length;i++){
            if(cur[i]=='{'){
                printSpace(space);
                System.out.println("if{");
                space +=2;
            }else{
                space-=2;
                printSpace(space);
                System.out.println("}");
            }
        }
        System.out.println();
    }
    public static void printSpace(int space){
        for (int i=0;i<space;i++){
            System.out.print("_");
        }
    }
}
