package Practice;

public class caculate_return {
    public static void main(String[] args){
        String a = "222";
        String b ="666";
        int c = sum(a) + sum(b)/2 ;
        System.out.println(sum(a));
        System.out.println(sum(b));
        System.out.println(c);
    }
    private static int sum(String d){
        char[] e = d.toCharArray();
        int total = 0 ;
        for(int i = 0 ; i<=e.length-1 ; i++ ){
            total += Character.getNumericValue(e[i]);
        }
        return total;
    }
}
