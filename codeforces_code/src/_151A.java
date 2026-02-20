import java.util.Scanner;

public class _151A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();
        int first=(k*l)/nl;
        int sec=c*d;
        int thir=p/np;
        int fourth=Math.min(first,sec);
        int fourth1=Math.min(fourth,thir);
        System.out.println(fourth1/n);


    }
}
