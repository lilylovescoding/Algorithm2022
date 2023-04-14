package Practice;

public class construct_2 {
    public int value;     //public可以去掉
    public int value_2;   //public可以去掉

    public construct_2() {          //无参数构造方法
    }
    public construct_2(int a,int b){ //有参数构造方法
        value=a;
        value_2=b;
    }
}
class print{
    public static void main(String[] args){
        construct_2 q=new construct_2();
        construct_2 a=new construct_2(5,4);
        System.out.println("无参数构造方法value为"+q.value);
        System.out.println("无参数构造方法value_2为"+q.value_2);
        System.out.println("有参数构造方法value为"+a.value);
        System.out.println("有参数构造方法value_2为"+a.value_2);

        changevalue1(a);
        System.out.println("有参数构造方法value_2为"+a.value);    //5
        System.out.println("有参数构造方法value_2为"+a.value_2);  //4

        changevalue2(a);
        System.out.println("有参数构造方法value_2为"+a.value);    //15
        System.out.println("有参数构造方法value_2为"+a.value_2);  //20

        a=changevalue3(a);
        System.out.println("有参数构造方法value_2为"+a.value);
        System.out.println("有参数构造方法value_2为"+a.value_2);

        int x=6;
        changevalue4(x);
        System.out.println("x的值为"+x);
    }
    public static void changevalue1(construct_2 b){
        construct_2 e=new construct_2(10,11);
        b=e;
    }
    public static void changevalue2(construct_2 c){
        c.value=15;
        c.value_2=20;
    }
    public static construct_2 changevalue3(construct_2 c){
        c.value=25;
        c.value_2=30;
        return c;
    }
    public static void changevalue4(int x){
        x=10;
        System.out.println("x的值为"+x);
    }
}
