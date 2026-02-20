import java.util.Scanner;

public class _1760B {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            String str=sc.next();
            str=str.toLowerCase();
            int max=0;
            for(int i=0;i<n;i++){
                int j=str.charAt(i)-'a';
                if(j>max){
                    max=j;
                }
            }
            System.out.println(max+1);
        }
    }
}
