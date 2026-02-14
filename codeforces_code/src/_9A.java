import java.util.Scanner;

public class _9A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int y=sc.nextInt();

            int max = Math.max(n, y);
            int quot = (6 - max) + 1;
            int a = 0;
            int b = 0;
            if (quot == 3) {
                a = 1;
                b = 2;
            }
            if (quot == 1) {
                a = 1;
                b = 6;
            }
            if (quot == 2) {
                a = 1;
                b = 3;

            }
            if (quot == 4) {
                a = 2;
                b = 3;
            }
            if (quot == 5) {
                a = 5;
                b = 6;
            }
            if (quot == 6) {
                a = 1;
                b = 1;
            }
            System.out.print(a + "/" + b);
        }
//        else{
//            System.out.print("1/1");
//        }


}
