package Practice;

public class test {
    int x;
    int y;

    public test(){  //无参构造方法
        System.out.println(x+" "+y);
    }
    public test(int a ,int b){ //有参构造方法
        x=a;
        y=b;

    }

    public static void main(String[] args){
        test c=new test();
        System.out.println(c.x+" "+c.y);

        test b=new test(5,6);
        System.out.println(b.x+" "+b.y);

        System.out.println(c.x+" "+c.y);

    }
}

