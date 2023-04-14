package Practice;

public class Main {
    public static void main(String[] args){
        B b =new B();
        b.f();
        b.a2.g(9);
    }
}
class B {
    public void f(){
        int x1=7;
        A ai=new A();
    }
    int x2=8;
    A a2 = new A();
}
class A{
    int x =7;
    public void g(int num){
        int x3=num;
        System.out.println(x3);
    }
}
