package Practice;

public class sum_2 {
    int s =6;
    int x=5;
    public static void main(String[] args){
        sum_2 u =new sum_2();
        u.add();
        int y=u.sum();
        System.out.println(y);
    }
    public void add(){
        s+=x;
    }
    public int sum(){
        return s;
    }
}
