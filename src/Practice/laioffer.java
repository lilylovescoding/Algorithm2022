package Practice;

public class laioffer {
    String name;
    String homeAddress;
    static String officeAddress;

    public laioffer(){     //无参数构造方法
    }
    public laioffer(String name,String homeAddress){ //有参数构造方法
        this.name=name;
        this.homeAddress=homeAddress;
        officeAddress="jinglong";
    }
    public static void moveOffice(){
        laioffer a=new laioffer();   //静态方法调用类
        a.homeAddress="no static files: San Jose,CA";  //静态方法中修改类属性需要new对象
        officeAddress="static files: San Jose,CA";     //OK!!  静态方法中修改静态变量不需要new对象
        //laioffer.officeAddress="static files: San Jose,CA";  //OK!!! 静态方法中修改静态变量可以用类名引用
        //officeAddress=homeAddress;  WROMG!!!         //静态方法用类属性需要new对象，用引用
        //officeAddress=a.homeAddress;    //OK!!       //静态方法用类属性需要new对象，用引用
    }
    public void moveHome(){
        name="xiaoming";               //OK!!!        ////类中的非静态方法可直接修改类属性
        homeAddress="xingzhuangcun";   //OK!!!        //类中的非静态方法可直接修改类属性
        //homeAddress=officeAddress;     //OK!!!
    }
}
class Test2{
    public static void main(String[] args){
        laioffer sun=new laioffer();
        System.out.println(sun.name);
        System.out.println(sun.homeAddress);
        System.out.println(sun.officeAddress);

        laioffer su=new laioffer("long","feng");
        System.out.println(su.name+su.homeAddress);
        su.name="longlong";
        su.homeAddress="longtingshoufu";
        System.out.println(su.name+su.homeAddress+su.officeAddress);
        su.moveOffice();
        System.out.println(su.officeAddress);
    }
}
