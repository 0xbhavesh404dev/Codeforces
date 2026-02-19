import java.util.Scanner;

public class _1294A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int n=sc.nextInt();
            int max=Math.max(Math.max(a,b),c);
            int req=(max-a)+max-b+(max-c);
            boolean flag =true;
            if(req<=n){
                n-=req;
                if(n%3==0){
                    flag =true;
                    //System.out.println("YES");
                }
                else{
                    flag =false;

                    // System.out.println("NO");
                }

            }
            else {
                flag = false;
            }
            if(flag){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
