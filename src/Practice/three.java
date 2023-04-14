package Practice;

public class three {
    public static void main(String[] args){
        int range = 1000;
        for(int i = 0 ; i<=range;i+=3){
            if(i%6!=0){
                System.out.println(i+"不能被6整除");
            }
        }
    }
}
