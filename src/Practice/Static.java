package Practice;

public class Static {
    int x=7;
    int y=8;
    public static void main(String[] args){
        Static a=new Static();
        int z =a.x+a.y;
        System.out.println(z);

        a.add();
        dayin();
        dayin_2();

        bb.dayin_3();

        bb u=new bb();
        u.dayin_4();
    }
    public void add(){
        System.out.println(x+y);
    }
    public static void dayin(){
        Static a=new Static();
        int z =a.x+a.y;
        System.out.println(z);
    }
    public static void dayin_2(){
        int x=1;
        int y=2;
        System.out.println(x+y);
    }
}
class bb{
    public static void dayin_3(){
        System.out.println("dayin_3");
    }
    public void dayin_4(){
        System.out.println("dayin_4");
    }

}
