package Practice;

public class test1 {
    public static void main(String[] args){
        Student tom = new Student("Tom", 22, 3.8, true);
        Student jerry = new Student("Jerry");
//        System.out.println(tom.gpa);

//        tom.sayHello(tom.getName());
        tom.setName("New Tom");
        System.out.println(tom.getName());
    }
}

//attributes + behavior
// 0 false null
//byte short int long float double char boolean
// 0     0    0   0    0.0   0.0 'false' false
//reference type   null
class Student {
    // fields   class variables   member fields
    private String name;
    int age;
    double gpa;
    boolean enrolled;

    //a special method
    public Student(String name, int age, double gpa, boolean enrolled){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.enrolled = enrolled;
    }

    public Student(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello, this is " + name);
    }

    //overload (same name, different signature)
    public void sayHello(Student anotherStudent){
        System.out.println("Hello, " + anotherStudent.name + " this is " + name);
    }
}

