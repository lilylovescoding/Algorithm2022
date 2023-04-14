package JavaSE;

public class Interface {                                        //  接口Interface是抽象方法的集合。 是完全抽象的，只包含 常量 和 抽象方法 。
    public static void main(String[] args){
        //访问接口的常量（只可访问不可修改）
        System.out.println(MyMath.PI);
        System.out.println(MyMath.k);

        //实现接口
        //使用多态 父类型引用指向子类型的对象
        MyMath mm=new MyMathImpl();
        //调用接口里面的方法：面向接口编程
        int result= mm.sum(10,20);
        System.out.println(result);
        mm.sub(20,10);

        //一个类中可以调用多个接口
        YourMath ym=new MyMathImpl();
        int result_sum2=ym.sum2(110,10);
        System.out.println(result_sum2);

        //接口转型
        //通过接口MyMath调用YourMath的方法，接口与接口之间的类型强制转换。编译不会出问题，但是运行可能会出现ClassCastException
        YourMath ty=(YourMath)mm;
        int result_sum3=ty.sum2(15,15);
        System.out.println(result_sum3);

    }
}

//定义接口
interface A{
}
//接口支持继承
interface B extends A{
}
//接口可以继承多个接口
interface C extends A,B{
}
//定义我的数学接口
interface MyMath{           //接口中只包含 常量 和 抽象方法。 所有元素都是public修饰 公开的。
    //常量
    //public static final double PI=3.1415926;  //常量：puclic和abstract和final可以省略，
    double PI=3.1415926;    //常量名都大写
    int k=10;
    //抽象方法
    //public abstract int sum(int a,int b);    //抽象方法：puclic和abstract可以省略，抽象方法不能带有方法体{ }
    int sum(int a , int b);
    void sub(int a, int b);
}
interface YourMath{
    int sum2(int a,int b);
}
 class MyMathImpl implements MyMath,YourMath{  //类中实现接口（可实现多个接口），必须将所有的方法全部重写，用implement关键字 //类与类之间叫继承 用 extends
    public int sum(int a,int b){
        return a+b;
    }
    public void sub(int a , int b){
        System.out.println(a-b);;
    }
    public int sum2(int a ,int b){
        return a+b;
    }
 }
