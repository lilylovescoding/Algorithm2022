package Practice;

public class Class_2_Methods_Functions {
    public static void main(String[] args) {
        int a = 2;
        double b = 1.2;
        double t = multiply(a, b);
        System.out.println(t);

        double c = 2.1;
        int d = 2;
        double e = multiply(c, d);
        System.out.println(e);

        int s = sign(0);
        System.out.println(s);
    }

    public static double multiply(int c, double d) {
        return c * d;
    }

    public static double multiply(double a, int b) {
        return a * b;
    }
    public static int sign(int x){
        if (x<0){
            return -1;
        }else if(x>0){
            return 1;
        }else{
            return 0;
        }

    }
}
