import java.util.Scanner;

public class _1968A {
    public static Scanner sc=new Scanner(System.in);
    static int checker(int a, int b, int c, int x){
        int first=Math.abs(a-x);
        int second=Math.abs(b-x);
        int third=Math.abs(c-x);
        int sum=first+second+third;
        return sum;

    }


    static void function(){
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int inp1=checker(a,b,c,a);
        int imp2=checker(a,b,c,b);
        int imp3=checker(a,b,c,c);
        System.out.print(Math.min(inp1,Math.min(imp2,imp3)));
//        if(inp1<min){
//            min=inp1;
//        }
//        else{
//            x=b;
//            int inp2=checker(a,b,c,x);
//            if(inp2<min){
//                min=inp2;
//            }
//            else{
//                x=c;
//                int inp3=checker(a,b,c,x);
//                if(inp3<min){
//                    min=inp3;
//                }
//            }
//        }
//        System.out.println(min);



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            function();
        }
    }
}
