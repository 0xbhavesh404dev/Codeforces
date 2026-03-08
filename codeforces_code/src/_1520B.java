import java.util.Scanner;

public class _1520B {

    static int digit(int n){
        int s=0;
        while(n>0){
            n/=10;
            s++;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t-- > 0){

            int n=sc.nextInt();

            if(n<10){
                System.out.println(n);
            }
            else{

                int d = digit(n);
                int first = n / (int)Math.pow(10,d-1);


                int ans = (d-1)*9 + first;

                int ordinary = 0;
                for(int i=0;i<d;i++){
                    ordinary = ordinary*10 + first;
                }

                if(ordinary > n) ans--;

                System.out.println(ans);
            }
        }
    }
}