package Practice;

public class class_1{
    public static void main(String[] args){
        int a = 3;
        int b = 7;
        double c = a/((double)b);
        System.out.println(c);
        //p13 取整
        int e=4;
        int r=3;
        System.out.println("e/r="+(e/r));
        //p15 string concatenation
        String s="abc"+1+"!!!";
        System.out.println(s);
        //p17 Equals:==
        int x=10;
        int y=11;
        System.out.println(y==x);
        //p7 type conversion --> cast
        //1)
        int q=1;
        double w=(double) q;
        System.out.println("q="+q+";w="+w);
        //2)
        double t =1.9;
        int u =(int)t;
        System.out.println(""+t+";u="+u);
        //3) double-->int,error
//        double i=1.9;
//        int o = i;
//        System.out.println("i="+i+";i="+i);
        //4)
        int d=1;
        double f=d;
        System.out.println("d="+d+",f="+f);
        //QUIZ
        //(1)
        int g=2, h=4,j=8;
        double result=(double)(g+h/j);
        System.out.println(result);
        //(2)
        int k=2,l=4,z=8;
        double v=k+(double)(l/z);
        System.out.println((v));
        //(3)
        int n=2,m=4,mn=8;
        double az=n+((double)m)/mn;
        System.out.println(az);
        //(4)
        int as =2,ad=4,af=8;
        double ag=as+1.0*ad/af;
        System.out.println(ag);








    }
}
