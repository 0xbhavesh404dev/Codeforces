import java.util.Scanner;

public class _1037A {
    static int min(int n){
        int min=9;
        while(n>0){
            int rem=n%10;
            n=n/10;
            if(min>rem){
                min=rem;
            }
        }


        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int min=min(n);
            System.out.println(min);
        }
    }
}
