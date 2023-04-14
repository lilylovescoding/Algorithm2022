package Practice;

public class Pass2 {
    int a;
    int b;
    static int c;

    public Pass2(){               //无参构造方法
    }
    public Pass2(int m,int n){   //有参数构造方法
        a=m;
        b=n;
        c=20;
    }
}

class Dayin2 {
    public static void main(String[] args) {
        Pass2 x = new Pass2();
        x.a = 10;
        System.out.println(x.a);
        System.out.println(x.b);
        System.out.println(x.c);

        Pass2 y = new Pass2(12,2);
        System.out.println(y.a);
        System.out.println(y.b);
        System.out.println(y.c);

        Pass2 z = new Pass2();
        System.out.println(z.a);
        System.out.println(z.b);
        System.out.println(z.c);

        System.out.println(x.a);
        System.out.println(x.b);
        System.out.println(x.c);
    }
}
