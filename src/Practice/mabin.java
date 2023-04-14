package Practice;

public class mabin {
    public static void main(String[] args){
        //错误
        //input=7 --> result:3个箱子错误，应该是4个箱子；
        int put=8;
        int result=pack(put);
        System.out.println(result);
    }
    private static int pack(int put){
        int box=0;
        for(int i=put/2;i>=0;i--){
            if(i*i>put){
                continue;
            }else{
                put -=i*i;
                box++;
                if(put==0){
                    break;
                }
            }
        }
        return box;
    }
}
