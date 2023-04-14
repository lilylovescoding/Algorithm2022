package Practice;

public class test2 {
    //静态变量y
    static int y=5;
    //静态方法（少数共有的行为，模板级别动作）
    static{
        //静态代码块
        System.out.println(y);
    }

    //实例变量 i 和 j （方法区之外，类之下）
    int i=100;
    int j=200;
    //实例方法（大多数行为，需要对象参与。某些工具类除外，会用static的方式去调用，但是不用new对象，比如求和运算，出发运算等）
    public void dosome(){
        //实例代码块
        System.out.println(88);
    }
    //构造方法  主程序入口
    public static void main(String[] args){

        test2 s= new test2();
        System.out.println(s.i);
        System.out.println(s.j);
        s.dosome();

        int i =200;
        System.out.println(i);
        System.out.println(y);
        System.out.println(test2.y);
    }

}
