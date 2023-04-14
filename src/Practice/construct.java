package Practice;

public class construct {
    public static void main(String[] args){
        Vip v1=new Vip();
        System.out.println(v1.no);
        System.out.println(v1.name);
        System.out.println(v1.birth);
        System.out.println(v1.sex);

        System.out.println();

        Vip v2=new Vip(1111L,"lele","19930319",true);
        System.out.println(v2.no);
        System.out.println(v2.name);
        System.out.println(v2.birth);
        System.out.println(v2.sex);
    }
}
class Vip{
    long no;
    String name;
    String birth;
    boolean sex;

    //无参数构造方法
    public Vip(){
    }
    //有参数构造方法
    public Vip(long no,String namm,String shengri,boolean xingbie){
        this.no=no;
        name=namm;
        birth=shengri;
        sex=xingbie;
    }
}
