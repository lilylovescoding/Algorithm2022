package Practice;

public class pass {
    int a;
    int b;
    static int c;

    public pass(){               //无参构造方法
    }
    public pass(int a,int b){   //有参数构造方法
        this.a=a;
        this.b=b;
        this.c=50;
    }
}
class dayin{
    public static void main(String[] args){
        pass a=new pass();
        System.out.println(a.a);
        System.out.println(a.b);
        System.out.println(a.c);

        pass b=new pass(1,2);
        change1(b);
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
        b.c=100;
        System.out.println(b.c);

        change2(b);
        System.out.println(b.a);
        System.out.println(b.b);
        System.out.println(b.c);
//
//        change3(b);
//        System.out.println(b.a);
//        System.out.println(b.b);
//
//        int x=9;
//        change4(x);
//        System.out.println(x);
    }
    public static void change1(pass c){
        pass d=new pass(3,4);
        c=d;
    }
    public static void change2(pass c){
        c.a=5;
        c.b=6;
        c.c=200;
    }
    public static pass change3(pass c){
        c.a=7;
        c.b=8;
        return c;
    }
    public static void change4(int x){
        x=10;
    }
}
