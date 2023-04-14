package JavaSE;

public class abstract_class {
    public static void main(String[] args){
        //能用多态就用多态：父类型引用 指向 子类型
        Animal bird=new Bird();                 //调用抽象类中的方法：面向抽象编程
        bird.move();

        Animal cat=new Cat();
        cat.move();

    }
}
abstract class Animal{
    public Animal(){
    }
    public abstract void move();                //抽象方法
}

class Bird extends Animal{                      //非抽象类继承抽象类方法必须重写方法，使用extends 关键字
    public void move(){
        System.out.println("鸟儿在飞翔！");
    }
}
class Cat extends Animal{
    public void move(){
        System.out.println("猫在走猫步！");
    }
}


/*abstract class Account{               //抽象类无法实力化 可有构造方法，给子类继承使用的； 抽象类也是引用数据类型
    public Account(){                   //无参数构造  供子类使用
    }
    public Account(String a){           //有参数构造
    }
    public void doOther(){              //非抽象方法
    }
    //public abstract void dosome();    //抽象方法  无大括号（方法体），抽象行为。
}
class CreditAccount extends Account{     //继承抽象类方法
    public CreditAccount(){              //继承无参数构造
        super();                         //调用无参数构造
    }
}*/
