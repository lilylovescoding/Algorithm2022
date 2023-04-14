package Review_20220116;

public class accumulator_544 {
    int s=3;  //实例变量s
    int x=5;  //实例变量x
    public static void main(String[] args){
        int f=8;  //局部变量f
        int g=9;  //局部变量g
        int t=f+g;  //局部变量t
        System.out.println("局部变量="+t);

        accumulator_544 b=new accumulator_544();
        add(b.x);
        System.out.println("实例变量="+add(b.x));


        method_2.dayin();

        method_2.dayin_3();

        method_2 c=new method_2();
        c.dayin_2();

    }
    public static int add(int x){
        accumulator_544 a=new accumulator_544();
        return a.sum();
    }
    public int sum(){
        return s+x;
    }
}
class method_2{
    int x=6;
    int y=8;
    public static void dayin(){
        System.out.println("方法二");
    }
    public void dayin_2(){
        int z=x+y;
        System.out.println("dayin_2="+z);
    }
    public static void dayin_3(){
        method_2 g=new method_2();
        int z=g.x+g.y;
        System.out.println("dayin_3="+z);
    }
}



