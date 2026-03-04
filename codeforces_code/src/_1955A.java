import java.util.Scanner;

public class _1955A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int p1=sc.nextInt();
            int p2=sc.nextInt();
            if(p1*2<=p2){
                System.out.println(n*p1);
            }
            else{
                if(n%2==0){
                    System.out.println((n/2)*p2);
                }
                else{
                    System.out.println((n/2)*p2 + p1);
                }
            }
           // System.out.println("hi");
        }
    }
}
