package Practice;

public class class_2 {
    public static void main(String[] args){
        //P21 pin"()"must be a boolean expression!
        int x=10;
        if (x>20){
            System.out.println("p21例子答案为：x>20");
        }else if(x>10){
            System.out.println("p21例子答案为：x>10");
        }else if(x>5){
            System.out.println("p21例子答案为：x>5");
        }else{
            System.out.println("p21例子答案为：其他");
        }
        //P23 改进 for一个循环例子
        int sum=0;
        for(int i =0;i<5;i++){
            sum+=i;
        }
        System.out.println("p23for循环例子答案为："+sum+"");

        //p25 while循环的一个例子
        int i=0;
        System.out.println("p25 while循环的一个例子答案为:");
        while (i<10){
            System.out.print(i+"； ");
            i+=3;
        }
        System.out.println('\n'+"The last i is"+i);

        //p26 continue
        int j;
        System.out.println("p26 continue result is:");

        for(j=0;j<10;j++){
            if(j==5){
                continue;
            }

            System.out.print(j+", ");
        }

        //p27 break
        int k;
        System.out.println('\n'+"p27 break result is:");
        for(k=0;k<10;k++){
            if(k==5){
                break;
            }
            System.out.print(k+", ");
        }

        //p27 for循环嵌套输出猜想
        System.out.println(" ");
        for(int a =0;a<2;a++){
            for(int b = 0;b<5;b++){
                if(b==2){
                    break;
                }
                System.out.print(a+","+b+" ");
            }
        }
    }
}