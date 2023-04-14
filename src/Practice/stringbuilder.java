package Practice;

public class stringbuilder {
    public static void main(String[] args){
        StringBuilder a = new StringBuilder();
        a.append(1);
        a.append("b");
        a.append(5);
        System.out.println(a);



        a.deleteCharAt(a.length()-1);
        System.out.println(a);

    }
}
