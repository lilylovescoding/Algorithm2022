package Practice;

public class Simple {
    public int value;      //无参数构造方法
    public Simple(int v){  //有参数构造方法

        value=v;
    }
}
class ChangeTest{
    public static void main(String[] args){
        //Q1
        Simple o1=new Simple(5);
        change1(o1);    //把地址o1传进来了
        System.out.println(o1.value);
        //Q2
        Simple o2=new Simple(5);
        change2(o2);
        System.out.println(o2.value);
        //Q3
        Simple o3=new Simple(5);
        o3 = change3(o3);
        System.out.println(o3.value);
        //04
        int x=5;
        changeIntvalue(x);
        System.out.println(x);
   }
   public static void change1(Simple a){   //call stack上复制了一个新地址a，指向Simple 5
        Simple o1=new Simple(10);
        a=o1;
   }
   public static void change2(Simple b){

        b.value=10;
   }
   public static Simple change3(Simple c){
        Simple o4=new Simple(20);
        return o4;
   }
   public static void changeIntvalue(int x){
        x=10;
       System.out.println("x为"+x);
   }
}
