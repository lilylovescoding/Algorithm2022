package Practice;

public class accumulator {
    private static int s = 1;
    public static void main(String[] args){
        add (s);
        System.out.println(sum(s));
    }
    public static void add(int x) {
        s += x;
    }
    public static int sum(int x) {
        return s;
    }
//    }
//    int s = 0;
//    public void add(int x){
//        s += x;
//    }
//    public int sum(){
//        return s;
//    }
}
